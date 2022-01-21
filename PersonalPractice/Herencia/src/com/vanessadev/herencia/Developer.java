package com.vanessadev.herencia;

public class Developer extends Person {
    private double salary;
    private String company;

    public Developer (String name, int age, double salary, String company){
        super(name, age);
        this.salary = salary;
        this.company = company;
    }
    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + company);
    }
}
