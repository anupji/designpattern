package com.design.pattern.javadp;

import java.util.Optional;

class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        Animal animal = catFactory.createAnimal();
        animal.speak();

        AnimalFactory dogFactory = new DogFactory();
        animal = dogFactory.createAnimal();
        animal.speak();

    }
}

interface AnimalFactory {
    Animal createAnimal();
}

class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}


interface Animal {
    void speak();
}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Dog bark");
    }
}
 class Cat implements Animal {
     @Override
     public void speak() {
         System.out.println("Cat meow");
     }
 }
 class Duck implements Animal {
     @Override
     public void speak() {
         System.out.println("Duck quacks");
     }
 }