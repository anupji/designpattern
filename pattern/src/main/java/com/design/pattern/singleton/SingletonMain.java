package com.design.pattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.show();
    }
}
