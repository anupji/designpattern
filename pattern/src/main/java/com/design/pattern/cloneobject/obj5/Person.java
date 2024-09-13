package com.design.pattern.cloneobject.obj5;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    Address address;
    public Person(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
