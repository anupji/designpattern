package com.design.pattern.prototype.clone;

import lombok.ToString;

@ToString
public class Person implements Cloneable {
    String name;
    Address address;
    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone();
        return cloned;
    }

}

