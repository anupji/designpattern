package com.design.pattern.puralstream;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Person> personList= new ArrayList<Person>();

    public City() {}
    public City(String name, List<Person> personList) {
        this.name = name;
        this.personList.addAll(personList);
    }

    public void setPersonList(List<Person> personList) {
        this.personList.addAll(personList);
    }
    public List<Person> getPersonList() {
        return personList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", personList=" + personList +
                '}';
    }
}
