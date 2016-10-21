package com.sa.sectionA.fifthLecture.sixthLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Teacher extends Student{
    private String dept;

    public Teacher(String name, int age, String studentID, double cgpa, String dept) {
        super(name, age, studentID, cgpa);
        this.dept = dept;
    }
}
