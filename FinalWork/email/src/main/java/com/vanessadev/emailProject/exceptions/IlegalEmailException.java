package com.vanessadev.emailProject.exceptions;

public class IlegalEmailException extends RuntimeException{

    public IlegalEmailException(){
        super("ERROR:Try again, The email address isn't valid");
    }
}