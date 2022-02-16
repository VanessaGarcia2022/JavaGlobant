package com.models;

import com.interfaces.Observer;
import com.interfaces.Subject;

public class Subscriber implements Observer {

    private final String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getStatus() + " was updated");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
