package com.vanessadev.emailProject.exceptions;

public class PrimaryRecipientNeededException extends RuntimeException{

    public PrimaryRecipientNeededException(){
        super("Primary Recipient always needed when you sent an Email");
    }
}