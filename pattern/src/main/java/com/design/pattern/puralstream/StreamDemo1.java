package com.design.pattern.puralstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

interface Sum {
    int sum(int a, int b);
}

class SumOne implements Sum {

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}

public class StreamDemo1 {

    public int demo1(int n, int k ) {
        return n+k;
    }

    public static void main(String[] args) {
        Person p1 = new Person("raman", 34);
        Person p2 = new Person("janak", 24);
        Person p3 = new Person("ratan", 22);
        Person p4 = new Person("subhash", 29);
        Person p5 = new Person("rajeev", 21);
        Person p6 = new Person("ashish", 30);
        Person p7 = new Person("parveen", 15);
        Person p8 = new Person("shravan", 56);
        Person p9 = new Person("manohar", 45);
        Person p10 = new Person("rajan", 23);

        List<Person> people = List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
        Person [] persons = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};

        //BinaryOperator<Integer> sumo = (a, b) -> a + b;
        //BinaryOperator<Integer> avg = (a, b) -> (a + b)/2;
        SumOne sumOne = new SumOne();
        int sum1 = sumOne.sum(5, 6);
        //System.out.println();

        long count1 = Arrays.stream(persons).count();
        //System.out.println("People count: " + count1);

        Stream.of(people).forEach(p-> System.out.println(p));

        long emptyNamesCount = people.stream().map(Person::getName).filter(name -> name.isEmpty()).count();
        //System.out.println("Empty names count: "+emptyNamesCount);

        long nonEmptyNamesCount = people.stream().map(Person::getName).filter(name -> !name.isEmpty()).count();
        //System.out.println("Non empty names count: "+nonEmptyNamesCount);

        City NewYork = new City("New York",List.of(p1,p2,p3));
        City Peris = new City("Peris",List.of(p4,p5,p6));
        City London = new City("London",List.of(p7,p8,p9,p10));

        List<City> cities = List.of(NewYork,Peris,London);
        long count = cities.stream().flatMap(city -> city.getPersonList().stream()).count();
        //System.out.println("Count: "+count);

        List<City> cities2 = List.of(NewYork,Peris,London);
        /*cities2.stream().flatMap(city -> city.getPersonList().stream()).map(Person::getName)
                .forEach(name -> System.out.println(name.toUpperCase()));*/

    }
}
