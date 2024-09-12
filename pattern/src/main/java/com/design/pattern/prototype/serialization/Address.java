package com.design.pattern.prototype.serialization;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Address implements Serializable {
    String city;
    String pincode;
    public Address(String city, String pincode){
        this.city =city;
        this.pincode = pincode;
    }
}

