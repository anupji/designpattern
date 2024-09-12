package com.design.pattern.abstractfactory;

public class ClientMain {
    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowsFactory();
        windowsFactory.createButton().paint();
        windowsFactory.createCheckBox().paint();
        UIFactory macBookFactory = new MacBookFactory();
        macBookFactory.createCheckBox().paint();
        macBookFactory.createButton().paint();
    }
}
