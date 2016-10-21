package com.sa.sectionA.fifthLecture.sixthLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Student extends Person {
    private String studentID;
    private double cgpa;
    public String status;


    public Student(String name, int age, String studentID, double cgpa) {
        super(name, age);
        //super();
        //status="active"; //student status access
        super.status="active";
        this.studentID = studentID;
        this.cgpa = cgpa;
    }

    public void print(){
        System.out.println(studentID+" "+cgpa);
        System.out.println(getName()+" "+getAge()+" "+this.status);
    }
}
