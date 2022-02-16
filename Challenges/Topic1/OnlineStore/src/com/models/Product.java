package com.models;

import com.interfaces.Observer;
import com.interfaces.Subject;

import java.util.ArrayList;

public abstract class Product implements Subject {


    private double price;
    private final String nameProduct;

    // constructor
    public  Product (String nameProduct, double price){
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        this.notification();
    }

    public String getStatus() {
         return this.nameProduct +"= "+ this.price;
    }

}
