package com.sa.sectionB.fifthLecture.sixthLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Teacher extends Student {
    public String dept;

    public Teacher(String name, int age, double cgpa, String studentId, String dept) {
        super(name, age, cgpa, studentId);
        this.dept = dept;
    }
}
