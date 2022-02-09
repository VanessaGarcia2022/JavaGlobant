package model;

import Interf.IHotDog;

public class BasicHotDog implements IHotDog {
    @Override
    public void showIngredient() {
        System.out.println("Bread \nSausage");
    }
}
