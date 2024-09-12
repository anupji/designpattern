package com.design.pattern.singleton;

import jakarta.servlet.http.PushBuilder;

import java.net.PortUnreachableException;

public enum EnumSingleton {
    INSTANCE;
    public void show(){
        System.out.println("enum singleton");
    }
}
