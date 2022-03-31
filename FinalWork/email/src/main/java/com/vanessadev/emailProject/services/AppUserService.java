package com.vanessadev.emailProject.services;

import com.vanessadev.emailProject.exceptions.EmailAlreadyExistsException;
import com.vanessadev.emailProject.model.AppUser;
import com.vanessadev.emailProject.repositories.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService {

    private final AppUserRepository repository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(String.format("Email  %s not founded", email)));
    }

    public String signUpUser(AppUser appUser){
        if(repository.findByEmail(appUser.getEmail()).isPresent()){
            throw new EmailAlreadyExistsException(appUser.getEmail());
        }

        appUser.setPassword(bCryptPasswordEncoder.encode(appUser.getPassword()));

        repository.save(appUser);
        return "USER REGISTERED";
    }
}
