package com.vanessadec.polimorfismo;

public class Gato extends Animal{
    @Override
    public void comer() {
        System.out.println("El gato esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El gato esta durmiendo");
    }

}
