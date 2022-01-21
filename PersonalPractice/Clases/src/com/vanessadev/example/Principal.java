package com.vanessadev.example;
import com.vanessadev.example.model.Persona;

public class Principal {
    public static void main(String[] args) {
        // String s1 = new String(); // create new instance
        Persona customer1 = new Persona("Maria", 22, "Calle 48");
        Persona customer2 = new Persona("Alejandra", 15, "Calle 36");
        //customer1
        System.out.println(customer1.name);
        System.out.println(customer1.age);
        System.out.println(customer1.address);
        //customer2
        System.out.println(customer2.name);
        System.out.println(customer2.age);
        System.out.println(customer2.address);
    }
}
