package com.vanessadev.strings;


public class StringManipulation {
    public static void main(String[] args) {
        String s1 = "Hola mundo";

        //indexing methods
        System.out.println("-----Indexing methods-----");
        int lenght = s1.length();
        char c = s1.charAt(1);
        int index = s1.indexOf("l");
        String s2 = s1.substring(0,4);
        String s3 = s1.substring(4);
        // print index methods
        System.out.println(lenght);
        System.out.println(c);
        System.out.println(index);
        System.out.println(s2);
        System.out.println(s3);

        // modification methods
        System.out.println("-----Imodification methods-----");
        String s4 = s1.concat(" aprendiendo JAVA");
        String s5 = s1.toLowerCase();
        String s6 = s1.toUpperCase();
        String s7 = s4.replace(" ", "_");

        //print modification methods
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);

        System.out.println(" ------------- ");

        // Encadenando los metodos
        System.out.println(
                s1.concat(" estoy aprendiendo a concatenar")
                        .toUpperCase()
                        .replace(" ", "_")
        );

        // inspection methods
        System.out.println("----- inspection methods-----");
        String s8 = "";

        //print inspection methods
        System.out.println(s1.isEmpty());
        System.out.println(s8.isEmpty());
        System.out.println(s1.contains("Hola"));
        System.out.println(s1.equals("VanessaDev"));
        System.out.println(s1.equalsIgnoreCase("Hola mundo"));



    }
}
