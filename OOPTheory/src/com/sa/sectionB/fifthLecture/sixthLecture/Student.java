package com.sa.sectionB.fifthLecture.sixthLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Student extends Person {
    private double cgpa;
    private String studentId;
    public String status;

    public Student(String name, int age, double cgpa, String studentId) {
        //super();
        //super(name, age);
        //this.status="active"; //Student class's status
        super.status = "active";
        System.out.println("Status: "+status);
        this.cgpa = cgpa;
        this.studentId = studentId;
    }

    public void print(){
        System.out.println(studentId+" "+cgpa);
        System.out.println(getName()+" "+this.age);
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
