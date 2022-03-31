package com.vanessadev.emailProject.exceptions;

public class BodyNeededException extends RuntimeException{
    public BodyNeededException(){
        super("Body needed to send an email");
    }
}