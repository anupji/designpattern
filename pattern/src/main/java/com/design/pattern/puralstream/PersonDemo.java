package com.design.pattern.puralstream;

import java.util.List;

public class PersonDemo {

    public static void main(String[] args) {
        Person p01 = new Person("raman", 34);
        Person p02 = new Person("janak", 24);
        Person p03 = new Person("ratan", 22);
        Person p04 = new Person("subhash", 29);
        Person p05 = new Person("rajeev", 21);
        /*Person p6 = new Person("ashish", 30);
        Person p7 = new Person("parveen", 15);
        Person p8 = new Person("shravan", 56);
        Person p9 = new Person("manohar", 45);
        Person p10 = new Person("rajan", 23);*/

        List<Person> people = List.of(p01, p02, p03, p04, p05);
        //int sum = 0;
        //int count = 0;

        double average = people.stream()
                .mapToInt(p -> p.getAge())
                .filter(age -> age > 20)
                .average()
                .orElseThrow();

        /*for (Person person : people) {
            if (person.getAge() > 20) {
                count++;
                sum += person.getAge();
            }
        }
        //double average = 0d;
        if (count > 0) {
            average = sum / count;
        }*/
        System.out.println("Average = " + average);
    }
}
