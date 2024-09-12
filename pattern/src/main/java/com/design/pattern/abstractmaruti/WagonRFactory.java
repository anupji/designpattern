package com.design.pattern.abstractmaruti;

public class WagonRFactory extends MarutiCarFactory{
    @Override
    Car getCar() {
        return new WagonR();
    }
}
