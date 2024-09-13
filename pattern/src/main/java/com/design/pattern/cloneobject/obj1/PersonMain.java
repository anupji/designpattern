package com.design.pattern.cloneobject.obj1;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("A",20);
        Person person1 = (Person) person.clone();
        person1.name = "B";
        System.out.println("Person: "+ person);
        System.out.println("Cloned: "+ person1);
    }
}
