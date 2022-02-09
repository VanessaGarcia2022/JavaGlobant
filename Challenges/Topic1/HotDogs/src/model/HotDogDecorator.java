package model;

import Interf.IHotDog;

/**
 * abstract class HotDogDecorator: that receives the object to be decorated and adds a method to obtain the
 * object information. (decorator templete)
 */
public abstract class HotDogDecorator implements IHotDog {
    private final IHotDog HOTDOG;

    // Constructor que recibe el objeto a decorar.
    public HotDogDecorator(IHotDog hotDog){
        this.HOTDOG = hotDog;
    }
    // retorna la informacion del objeto.
    public IHotDog getHotDog() {
        return this.HOTDOG;
    }
}
