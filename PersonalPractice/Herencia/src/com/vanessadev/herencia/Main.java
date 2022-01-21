package com.vanessadev.herencia;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Vanessa", 27, 1000, "Rescot");
        Student st = new Student("Juan", 22, 4.5, "I.E la vida");
        dev.showInfo();
        System.out.println("------------------");
        st.showInfo();
    }
}
