package com.design.pattern.abstractfactory;

public class MacBookButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacBook Button");
    }
}
