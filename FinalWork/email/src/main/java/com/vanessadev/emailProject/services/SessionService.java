package com.vanessadev.emailProject.services;

import com.vanessadev.emailProject.dto.MailDTO;
import com.vanessadev.emailProject.dto.MailResponseDTO;
import com.vanessadev.emailProject.exceptions.BodyNeededException;
import com.vanessadev.emailProject.exceptions.PrimaryRecipientNeededException;
import com.vanessadev.emailProject.model.AppUser;
import com.vanessadev.emailProject.model.Mail;
import com.vanessadev.emailProject.repositories.AppUserRepository;
import com.vanessadev.emailProject.repositories.MailRepository;
import com.vanessadev.emailProject.util.MailLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SessionService {

    @Autowired
    private AppUserRepository mailUserRepository;

    @Autowired
    private MailRepository mailRepository;

    public Set<Mail> getInbox(Principal principal){
        return  mailUserRepository.findAll().stream()
                .filter(user -> user.getEmail().equals(principal.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("ERROR: Something wrong happened with the inbox method"))
                .getMails();
    }

    public List<MailResponseDTO> getSentMails(Principal principal){
        return  mailRepository.findAll().stream().
                filter(mail -> mail.getSender().equals(principal.getName())).
                map(mail -> new MailResponseDTO(
                        mail.getSender(),
                        mail.getPrimaryRecipient(),
                        mail.getCarbonCopy(),
                        mail.getBlindCarbonCopy(),
                        mail.getSubject(),
                        mail.getBody(),
                        mail.getAttachments(),
                        mail.getLabel().toString()
                )).distinct()
                .toList();

    }

    public Set<Mail> searchMailByLabel(Principal principal, MailLabel label){
        return  mailUserRepository.findAll().stream()
                .filter(user -> user.getEmail().equals(principal.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("ERROR: Something wrong happened with the search method"))
                .getMails().stream()
                .filter(mail -> mail.getLabel().contains(label))
                .collect(Collectors.toSet());
    }

    public String sendMail(Principal principal, MailDTO mail){
        if(mail.getPrimaryRecipient() == null){
            throw new PrimaryRecipientNeededException();
        }

        if(mail.getSubject() == null){
            throw new IllegalStateException("ERROR: Subjects needs to be filled");
        }

        if (mail.getBody() == null){
            throw new BodyNeededException();
        }

        if(mail.getBlindCarbonCopy() == null){
            mail.setBlindCarbonCopy("");
        }

        if(mail.getLabel() == null){
            mail.setLabel(new ArrayList<>(){{
                add(MailLabel.NORMAL);
            }});
        }

        List<String> username = Arrays.asList((mail.getPrimaryRecipient() + "," +  mail.getCarbonCopy() +  "," + mail.getBlindCarbonCopy()).split(","));

        List<AppUser> users = mailUserRepository.findAll().stream()
                .filter(u -> username.stream()
                        .anyMatch(name -> name.equals(u.getEmail())))
                .toList();

        List<String> blindCarbonCopyNames = Arrays.asList(mail.getBlindCarbonCopy().split(","));

        List<AppUser> BlindCarbonCopyUsers = mailUserRepository.findAll().stream()
                .filter(u -> blindCarbonCopyNames.stream()
                        .anyMatch(name -> name.equals(u.getEmail())))
                .toList();

        String statement = "";
        for(AppUser user: users){
            if(user.getMails().stream().anyMatch(m -> ((m.getSubject().equals(mail.getSubject())) && (m.getBody().equals(mail.getBody()))))){
                statement =  "MAIL ALREADY EXISTS";
            }else{
                Mail toSend;
                if(BlindCarbonCopyUsers.contains(user)){
                    toSend = new Mail(principal.getName(),
                            mail.getPrimaryRecipient(),
                            mail.getCarbonCopy(),
                            mail.getBlindCarbonCopy(),
                            mail.getSubject(),
                            mail.getBody(),
                            mail.getAttachments(),
                            true,
                            mail.getLabel());
                }else{
                    toSend = new Mail(principal.getName(),
                            mail.getPrimaryRecipient(),
                            mail.getCarbonCopy(),
                            mail.getBlindCarbonCopy(),
                            mail.getSubject(),
                            mail.getBody(),
                            mail.getAttachments(),
                            false,
                            mail.getLabel());
                }

                toSend.getMailUsers().add(user);
                mailRepository.save(toSend);
                statement = "MAIL SENT";
            }
        }

        return statement;
    }
}
