package com.vanessadev.herencia;

public class Student extends Person {
    private double score;
    private String school;

    public Student(String name, int age, double score, String school) {
        super(name, age);
        this.score = score;
        this.school = school;
    }
    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Score: " + score);
        System.out.println("School: " + school);
    }

}
