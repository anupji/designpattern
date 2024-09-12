package com.design.pattern.marutifactory;

public class MarutiClient {
    public static void main(String[] args) {
        MarutiCarFactory factory = new MarutiCarFactory();
        Car car = factory.getCar(CarType.SEDAN);
        System.out.println(car.getClass().getSimpleName()+ " has " + car.getEngineCC() + " with price "+ car.getPrice());
    }
}
