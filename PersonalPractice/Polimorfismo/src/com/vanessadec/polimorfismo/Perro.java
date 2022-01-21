package com.vanessadec.polimorfismo;

public class Perro extends Animal{
    //Sobre escritura de metodos
    // "@Override" es una annotation que le dice al compilador que si llaman al metodo "comer" de la clase perro se
    // deben ejecular los metodos que están sobreescritos ene sta clase

    @Override
    public void comer() {
        System.out.println("El perro esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro esta durmiendo");
    }
}
