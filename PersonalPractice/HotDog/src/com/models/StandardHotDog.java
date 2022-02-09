package com.models;

import com.interfaces.IFoodCar;

public class StandardHotDog implements IFoodCar
{

    @Override
    public void addItem()
    {
        System.out.println("Pan y Salchicha");
    }

}
