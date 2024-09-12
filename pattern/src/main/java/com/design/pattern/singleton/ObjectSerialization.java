package com.design.pattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        exampleSerialization();
        //Creating singleton using reflection, this problem can be resolved by EnumSingleton
        exampleReflection();
    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOuputStream = new ObjectOutputStream(new FileOutputStream("object.ser"));
        objectOuputStream.writeObject(lazySingleton);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.ser"));
        LazySingleton lazySingletonObject = (LazySingleton) objectInputStream.readObject();

        System.out.println("Object 1: " + lazySingleton.hashCode());
        System.out.println("Object 2: "+ lazySingletonObject.hashCode());

        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOuputStream2 = new ObjectOutputStream(new FileOutputStream("object2.ser"));
        objectOuputStream2.writeObject(serializableSingleton);

        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object2.ser"));
        SerializableSingleton serializableSingletonObject = (SerializableSingleton) objectInputStream2.readObject();

        System.out.println("Object 1: " + serializableSingleton.hashCode());
        System.out.println("Object 2: "+ serializableSingletonObject.hashCode());

    }

    private static void exampleReflection() throws InvocationTargetException, InstantiationException,
            IllegalAccessException {
        Constructor [] constructors = LazySingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("Reflected hashcode singleton: "+ lazySingleton.hashCode());
        System.out.println("Single instance: "+ instance.hashCode());
    }
}
