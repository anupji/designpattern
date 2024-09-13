package com.design.pattern.marutiprototype;

public class WagonR extends Car{

    public WagonR(){super();
        System.out.println("WagonR default constructor");}
    public WagonR(Car car) { super(car);
        System.out.println("WagonR copy constructor");
    }

    @Override
    public int getEngineCC() {
        return 1000;
    }

    @Override
    public int getPrice() {
        return 500000;
    }

    //@Override
    public Car getClone(Car car) {
        return new WagonR(car);
    }
}
