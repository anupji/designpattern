package com.design.pattern.puralstream;

import java.util.ArrayList;

/*public class MyCollection<Person2> {
    List<Person2> myCollection = new ArrayList<Person2>();
    public MyCollection() {}
    public MyCollection(Person2 person) {
        this.myCollection.add(person);
    }
}*/



public class MyCollection<E> extends ArrayList<E> {
    public MyCollection() {
        super();
    }

    @Override
    public boolean add(E element) {
        //System.out.println("Adding: " + element);
        return super.add(element);
    }
}
