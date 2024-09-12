package com.design.pattern.abstractfactory;

public class MacBookFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacBookButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacBookCheckBox();
    }
}
