package model.ingredients;

import Interf.IHotDog;
import model.HotDogDecorator;

public class Pineapple extends HotDogDecorator {

    // constructor que recibe el objeto a decorar y lo coloca en la clase padre.
    public Pineapple(IHotDog hotDog){
        super(hotDog);
    }

    @Override
    public void showIngredient() {
        //obtenemos la infomarcion del objeto actual
        this.getHotDog().showIngredient();
        // agregamos el ingrediente.
        System.out.print(", Pineapple");
    }
}
