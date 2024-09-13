package com.design.pattern.cloneobject.obj3;

public class PersonMain {
    public static void main(String[] args) {
        Address address = new Address("AGRA");
        Person person = new Person("A",20,address);
        Person person1 = (Person) person.clone();
        person1.address.city="MATHURA";
        System.out.println("Person: "+person);
        System.out.println("Cloned: "+person1);
    }
}
