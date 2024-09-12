package com.design.pattern.abstractmaruti;

public abstract class MarutiCarFactory {
    public MarutiCarFactory(){}
    abstract Car getCar();

    /*public Car getCar(CarType carType){
        switch (carType){
            case SEDAN: return new Ciaz();
            case HATCHBACK: return new WagonR();
            case SUV: return new Breeza();
        }
        return null;
    }*/
}
