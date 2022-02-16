package com.models;

import com.interfaces.Observer;

import java.util.ArrayList;

public class MechanicalKeyboard extends Product{

    public MechanicalKeyboard(String nameProduct, double price) {
        super(nameProduct, price);
    }

    private ArrayList<Observer> productSubscribers = new ArrayList<>();

    @Override
    public void attach(Observer observer) { // add subscriber
        productSubscribers.add(observer);
    }

    @Override
    public void detach(Observer observer) {// delete subscriber
        productSubscribers.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer: productSubscribers) {
            System.out.print(observer.toString()+": ");
            observer.update(this);
        }
    }
}
