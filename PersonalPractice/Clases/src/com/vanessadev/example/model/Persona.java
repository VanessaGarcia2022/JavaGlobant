package com.vanessadev.example.model;

public class Persona {
    //atributos de clase (atributos del objeto)
    // deben ser publicos para que puedan ser accedidos por las instancias.
    public String name;
    public int age;
    public String address;

    // Constructor de clase (Una clase puede tener varios contructores.)
    public Persona(){
        // puede ir vacio
    }
    // segundo constructor
    public Persona(String name, int age,String address) {
        // this es lo mismo que self en python
        this.name = name;
        this.age = age;
        this.address = address;

    }

}
