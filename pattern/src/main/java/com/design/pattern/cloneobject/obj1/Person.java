package com.design.pattern.cloneobject.obj1;

public class Person implements Cloneable{
    String name;
    int age;
    public Person(String name, int age){
        this.name =name;
        this.age = age;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
