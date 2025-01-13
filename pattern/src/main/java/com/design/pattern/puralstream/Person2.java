package com.design.pattern.puralstream;

public class Person2 extends Person {
    private String city;
    public Person2(String name, int age, String city) {
        super(name, age);
        this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", city='" + city + '\'' +
                '}';
    }
}
