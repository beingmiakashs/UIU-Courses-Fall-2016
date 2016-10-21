package com.sa.sectionA.fifthLecture.sixthLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Person {
    private String name;
    private int age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
