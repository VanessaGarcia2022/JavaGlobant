package model;

import Interf.IHotDog;

/**
 * BasicHotdog: concrete class that implements the initial interface and create the basic object
 */
public class BasicHotDog implements IHotDog {
    @Override
    public void showIngredient() {
        System.out.print("Bread, Sausage");
    }
}
