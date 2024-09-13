package com.design.pattern.cloneobject.obj5;

import java.io.Serializable;

public class Address implements Serializable {
    String city;
    public Address(String city){
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
