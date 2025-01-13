package com.design.pattern.puralstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        Person2 p1 = new Person2("raman", 34,"New York");
        Person2 p2 = new Person2("janak", 24,"New York");
        Person2 p3 = new Person2("ratan", 22,"New York");
        Person2 p4 = new Person2("subhash", 29,"New York");
        Person2 p5 = new Person2("rajeev", 21,"Paris");
        Person2 p6 = new Person2("ashish", 30, "Paris");
        Person2 p7 = new Person2("parveen", 15, "Paris");
        Person2 p8 = new Person2("shravan", 56, "London");
        Person2 p9 = new Person2("manohar", 45, "London");
        Person2 p10 = new Person2("rajan", 23, "London");

        List<Person2> people = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9,p10);
        List<Person2> people2 = new ArrayList<>();
        List<Person2> people3 = new ArrayList<>(people);
        List<Person2> people4 = new ArrayList<>(people);
        List<Person2> people5 = new ArrayList<>(people);
        List<Person2> people6 = new ArrayList<>(people);
        // In-correct way
        /*people.stream()
                .filter(p->p.getCity().equals("New York"))
                .forEach(p-> people2.add(p));*/
        // Correct way
        List<Person2> newYork = people.stream()
                .filter(p -> p.getCity().equals("New York"))
                .toList();
        System.out.println(newYork);
        System.out.println();
        // You can use Set also
        Set<Person2> paris = people.stream()
                .filter(p -> p.getCity().equals("Paris"))
                .collect(Collectors.toSet());
        System.out.println(paris);
        System.out.println();
        // Collect to your own custom collection
        MyCollection<Person2> london = people.stream()
                .filter(p -> p.getCity().equals("London"))
                .collect(Collectors.toCollection(MyCollection::new));
        System.out.println(london);
        System.out.println();
        String nameConcatinationString = people.stream()
                .filter(p -> p.getCity().equals("Paris"))
                .map(p -> p.getName())
                .collect(Collectors.joining(", "));
        System.out.println(nameConcatinationString);
    }
}
