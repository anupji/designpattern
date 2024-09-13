package com.design.pattern.cloneobject.obj5;

import java.io.*;

public class PersonMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("AGRA");
        Person person = new Person("A",20,address);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(person);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        person1.age =30;
        person1.address.city="MATHURA";
        System.out.println("Person: "+person);
        System.out.println("Cloned: "+person1);
    }
}
