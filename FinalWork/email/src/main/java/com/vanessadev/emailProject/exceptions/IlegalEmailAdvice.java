package com.vanessadev.emailProject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class IlegalEmailAdvice {

    @ResponseBody
    @ExceptionHandler(IlegalEmailException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    String IlegalEmailAdvice(IlegalEmailException ex){
        return ex.getMessage();
    }
}
