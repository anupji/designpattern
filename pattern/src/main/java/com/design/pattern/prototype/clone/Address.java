package com.design.pattern.prototype.clone;

import lombok.ToString;

@ToString
public class Address implements Cloneable {
    String city;
    String pincode;
    public Address(String city, String pincode){
        this.city =city;
        this.pincode = pincode;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

