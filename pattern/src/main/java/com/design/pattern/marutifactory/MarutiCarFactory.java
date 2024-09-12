package com.design.pattern.marutifactory;

public class MarutiCarFactory {
    public MarutiCarFactory(){}

    public Car getCar(CarType carType){
        switch (carType){
            case SEDAN: return new Ciaz();
            case HATCHBACK: return new WagonR();
            case SUV: return new Breeza();
        }
        return null;
    }
}
