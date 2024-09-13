package com.design.pattern.marutiprototype;

public abstract class Car implements VehicleInterface, Cloneable{
    private int modelYear;

    public Car(){}
    public Car(Car car){
        this.modelYear = car.modelYear;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public Car clone(){
        try {
            return (Car)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
