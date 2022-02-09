package model.ingredients;

import Interf.IHotDog;
import model.HotDogDecorator;

/**
 * Bacon: classes that implement the abstract class that serve to decorate the original object
 */
public class Bacon extends HotDogDecorator {

    // recibe el objeto de la interface Hotdog a la que se le va agragar la tocinieta.
    public Bacon(IHotDog hotDog){
        super(hotDog);
    }

    @Override
    public void showIngredient() {
        // muestra los ingredientes que ya tiene y le agrega "bacon"
        this.getHotDog().showIngredient();
        System.out.print(", Bacon");
    }
}
