package model.ingredients;

import Interf.IHotDog;
import model.HotDogDecorator;

/**
 * Sauces: classes that implement the abstract class that serve to decorate the original object
 */
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
