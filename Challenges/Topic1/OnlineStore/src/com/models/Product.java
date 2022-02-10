package com.models;

import com.interfaces.Observer;
import com.interfaces.Subject;

import java.util.ArrayList;

public abstract class Product implements Subject {

    private static ArrayList<Observer> productSubscribers;
    private double price;
    private String nameProduct;

    // constructor
    public  Product (String nameProduct, double price){
        setProductSubscribers(new ArrayList<Observer>());
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public void setProductSubscribers(ArrayList<Observer> productSubscribers) {
        this.productSubscribers = productSubscribers;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
        this.notification();
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }


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
        System.out.println(productSubscribers.toString());
        for (Observer observer: productSubscribers) {
            observer.toString();
            observer.update();
        }
    }
}
