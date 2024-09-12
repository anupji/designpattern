package com.design.pattern.abstractmaruti;

public class BreezaFactory extends MarutiCarFactory{
    @Override
    Car getCar() {
        return new Breeza();
    }
}
