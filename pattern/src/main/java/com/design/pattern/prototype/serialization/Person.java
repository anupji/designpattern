package com.design.pattern.prototype.serialization;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Person implements Serializable {
    String name;
    Address address;
    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }
}

