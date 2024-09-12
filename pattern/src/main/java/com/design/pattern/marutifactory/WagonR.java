package com.design.pattern.marutifactory;

public class WagonR extends Car{
    @Override
    public int getEngineCC() {
        return 1000;
    }

    @Override
    public int getPrice() {
        return 500000;
    }
}
