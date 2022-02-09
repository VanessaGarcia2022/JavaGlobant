package model.ingredients;

import Interf.IHotDog;
import model.HotDogDecorator;
// clase que hereda el decorador
public class ShoestringPotatoes extends HotDogDecorator {
    // recibe una instancia de la interface
    public ShoestringPotatoes(IHotDog hotDog){
        super(hotDog);
    }

    @Override
    public void showIngredient() {
        //obtener la informacion del objeto a decorar
        this.getHotDog().showIngredient();
        // agregar el ripio de papa
        System.out.print(", Shoestring Potatoes");
    }
}
