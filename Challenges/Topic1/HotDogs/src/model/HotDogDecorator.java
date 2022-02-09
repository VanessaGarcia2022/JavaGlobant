package model;

import Interf.IHotDog;

public abstract class HotDogDecorator implements IHotDog {
    private IHotDog hotDog;

    // Constructor que recibe el objeto a decorar.
    public HotDogDecorator(IHotDog hotDog){
        this.hotDog = hotDog;
    }
    // retorna la informacion del objeto.
    public IHotDog getHotDog() {
        return this.hotDog;
    }
}
