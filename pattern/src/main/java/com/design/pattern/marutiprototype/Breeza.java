package com.design.pattern.marutiprototype;

public class Breeza extends Car{

    public Breeza(){ super();
        System.out.println("Breeza default constructor");}
    public Breeza(Car car) {
        super(car);
        System.out.println("Breeza copy constructor");
    }

    @Override
    public int getEngineCC() {
        return 1500;
    }

    @Override
    public int getPrice() {
        return 1200000;
    }

    //@Override
    public Car getClone(Car car) {
        return new Breeza(car);
    }
}
