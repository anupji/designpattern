package com.design.pattern.marutibuilder;

public class CarMain {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder2023 = new Car.CarBuilder(2000,2000000);
        carBuilder2023.setModelYear(2023);
        Car car = carBuilder2023.build();
        System.out.println(car.getClass().getSimpleName()+": "+ car.hashCode()+ " has engine CC: " + car.getEngineCC() +" with price Rs.: "+ car.getPrice()+" model Year: "+ car.getModelYear());

        Car.CarBuilder carBuilder2021 = new Car.CarBuilder(1800, 1500000);
        car = carBuilder2021.build();
        System.out.println(car.getClass().getSimpleName()+": "+ car.hashCode()+ " has engine CC: " + car.getEngineCC() +" with price Rs.: "+ car.getPrice()+" model Year: "+ car.getModelYear());

    }
}
