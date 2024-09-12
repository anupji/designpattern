package com.design.pattern.prototype.clone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        String salute = "HELLO";
        String cloned = new String(salute);
        System.out.println("salute == cloned: " + (salute == cloned));
        System.out.println("salute.equals(cloned): " + salute.equals(cloned));
        System.out.println(salute+" "+ cloned);

        // multiple ways to clone list
        List<String> books = Arrays.asList("Unleashed Java", "Head First Design Pattern");
        List<String> newBooks = new ArrayList<>(books);
        List<String> myBooks =new ArrayList<>(Collections.nCopies(books.size(),""));
        Collections.copy(myBooks, books);
        List<String> theBooks = books.stream().collect(Collectors.toList());

        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        List<String> fruits = (ArrayList<String>) ((ArrayList<String>) originalList).clone();

        newBooks.add("Godaan");
        System.out.println(books);
        System.out.println(newBooks);
        System.out.println(myBooks);
        System.out.println(theBooks);
        System.out.println(fruits);

        Address address = new Address("prayag raj", "211001");
        Person person = new Person("rakesh",address);
        Person clonedPerson = (Person) person.clone();
        clonedPerson.name = "rajesh";
        System.out.println("person "+ person);
        System.out.println("cloned person "+ clonedPerson);
    }
}

