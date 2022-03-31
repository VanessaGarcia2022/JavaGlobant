package com.vanessadev.emailProject.services;

import com.vanessadev.emailProject.exceptions.IlegalEmailException;
import com.vanessadev.emailProject.model.AppUser;
import com.vanessadev.emailProject.model.AppUserRole;
import com.vanessadev.emailProject.model.RegistrationRequest;
import com.vanessadev.emailProject.util.EmailValidator;
import com.vanessadev.emailProject.util.IdentificationNumberValidator;
import com.vanessadev.emailProject.util.zipCodeValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;
    private final zipCodeValidator zipCodeValidator;
    private final IdentificationNumberValidator identificationNumberValidator;


    public String register(RegistrationRequest request) {
        if(!(identificationNumberValidator.test(request.getIdentificationNumber()))){
            throw new IllegalStateException("ERROR: Try again, Identification number isn't valid");
        }

        if(!(zipCodeValidator.test(request.getZipCode()))){
            throw new IllegalStateException("ERROR: Try again, Zip code isn't valid");
        }

        if(!(emailValidator.test(request.getEmail()))){
            throw new IlegalEmailException();
        }

        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getIdentificationNumber(),
                        request.getAddress(),
                        request.getZipCode(),
                        request.getCity(),
                        request.getState(),
                        request.getCountry(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}