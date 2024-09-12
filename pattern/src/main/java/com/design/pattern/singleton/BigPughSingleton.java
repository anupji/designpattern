package com.design.pattern.singleton;

public class BigPughSingleton {
    private BigPughSingleton(){}
    private static class SingletonHelper {
        private static BigPughSingleton INSTANCE = new BigPughSingleton();
    }
    public BigPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
