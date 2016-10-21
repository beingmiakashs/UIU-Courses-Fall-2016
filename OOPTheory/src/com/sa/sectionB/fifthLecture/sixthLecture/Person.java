package com.sa.sectionB.fifthLecture.sixthLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Person {
    private String name;
    public int age;
    public String status;

    public Person() {
    }

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
