package com.design.pattern.abstractmaruti;

public class CiazFactory extends MarutiCarFactory{
    @Override
    Car getCar() {
        return new Ciaz();
    }
}
