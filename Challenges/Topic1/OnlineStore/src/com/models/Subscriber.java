package com.models;

import com.interfaces.Observer;
import com.interfaces.Subject;

public class Subscriber implements Observer {

    private Product product;
    private String name;

    public Subscriber(String name){
        this.name = name;
    }
    // referencia al observable para poder acceder a la informacion actualizada.
    public void subscribe (Subject product){
        this.product = (Product) product;
    }
    @Override
    public void update() {
        System.out.println("The price of "+ this.product.getNameProduct()+" was updated: " + this.product.getPrice());
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "product=" + product +
                ", name='" + name + '\'' +
                '}';
    }
}
