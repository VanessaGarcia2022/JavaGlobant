package model.ingredients;

import Interf.IHotDog;
import model.HotDogDecorator;

public class Sauces extends HotDogDecorator {
    public Sauces (IHotDog hotDog){
        super(hotDog);
    }

    @Override
    public void showIngredient() {
        this.getHotDog().showIngredient();
        System.out.print(", Sauces");
    }
}
