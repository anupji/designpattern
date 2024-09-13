package com.design.pattern.cloneobject.obj4;

public class Address implements Cloneable{
    String city;
    public Address(String city){
        this.city = city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
