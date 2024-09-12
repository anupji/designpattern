package com.design.pattern.prototype.serialization;

import java.io.*;

public class PrototypeMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("Delhi","110001");
        Person person = new Person("Rakesh",address);

        Person cloned = getPerson(person);
        cloned.name = "Ratnesh";
        cloned.address.city = "Jaipur";
        cloned.address.pincode = "510001";
        System.out.println(person == cloned);
        System.out.println(person.equals(cloned));
        System.out.println(person);
        System.out.println(cloned);
    }

    private static <T> T getPerson(T person) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(person);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        T cloned = (T) objectInputStream.readObject();
        return cloned;
    }
}
