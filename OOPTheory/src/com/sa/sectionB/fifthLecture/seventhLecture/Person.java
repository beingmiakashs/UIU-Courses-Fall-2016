package com.sa.sectionB.fifthLecture.seventhLecture;

/**
 * Created by akashs on 10/18/16.
 */
public abstract class Person {
    private String name;
    public int age;
    public String status;

    public Person() {
    }

    public abstract void print();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
