package com.design.pattern.abstractfactory;

public class MacBookCheckBox implements  CheckBox{
    @Override
    public void paint() {
        System.out.println("MacBook CheckBox");
    }
}
