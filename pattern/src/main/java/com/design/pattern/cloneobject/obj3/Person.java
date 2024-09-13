package com.design.pattern.cloneobject.obj3;

public class Person implements Cloneable{
    String name;
    int age;
    Address address;
    public Person(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone();
            cloned.address = new Address(this.address.city);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
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
