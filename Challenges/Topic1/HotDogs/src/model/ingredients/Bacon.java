package model.ingredients;

import Interf.IHotDog;
import model.HotDogDecorator;

public class Bacon extends HotDogDecorator {

    // recibe el objeto de la interface Hotdog a la que se le vaa agragar la tocinieta.
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
