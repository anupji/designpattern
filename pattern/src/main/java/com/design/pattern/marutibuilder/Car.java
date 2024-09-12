package com.design.pattern.marutibuilder;

public class Car {
    private final int engineCC;
    private final int price;
    private final int modelYear;

    public int getEngineCC() {
        return engineCC;
    }

    public int getPrice() {
        return price;
    }

    public int getModelYear() {
        return modelYear;
    }

    private Car(CarBuilder carBuilder) {
        this.engineCC = carBuilder.engineCC;
        this.price = carBuilder.price;
        this.modelYear = carBuilder.modelYear;
    }

    public static class CarBuilder {
        private final int engineCC;
        private final int price;

        public void setModelYear(int modelYear) {
            this.modelYear = modelYear;
        }

        private int modelYear;

        public CarBuilder(int engineCC, int price) {
            this.engineCC = engineCC;
            this.price = price;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
