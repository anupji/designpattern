package com.design.pattern.object;

import java.util.Objects;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks){
        this.name =name;
        this.marks =marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return marks == student.marks && Objects.equals(name, student.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,marks);
    }
}
