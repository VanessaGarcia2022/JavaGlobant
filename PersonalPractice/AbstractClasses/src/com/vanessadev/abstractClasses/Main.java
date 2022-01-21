package com.vanessadev.abstractClasses;

public class Main {
    public static void main(String[] args) {
        //Figure f = new Figure(); * no se pueden instanciar clases abstractas
        // solo se pueden heredar de las clases abstractas
        Square s = new Square();
        s.display();
    }
}
