package com.vanessadev.interfaces;

public class EnglishLanguage implements Language{

    @Override // para sobreescribir el metodo de la interfaz
    public void sayHi() {
        System.out.println("Hi from English Language");

    }

    @Override
    public void sayBye() {
        System.out.println("Bye from english");
    }
}
