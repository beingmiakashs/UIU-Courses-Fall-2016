package com.sa.sectionB.fifthLecture.seventhLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Student extends Person {
    private double cgpa;
    private String studentId;
    public String status;

    @Override
    public boolean equals(Object obj) {
        Student tm = (Student) obj;
        if(this.studentId.equals(tm.studentId)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        String res = studentId+" "+getName()+" "+cgpa;
        return res;
    }


    public Student(String name, int age, double cgpa, String studentId) {
        //super();
        super(name, age);
        //this.status="active"; //Student class's status
        super.status = "active";
        //System.out.println("Status: "+status);
        this.cgpa = cgpa;
        this.studentId = studentId;
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


    public static void main(String[] args) {
        Student student1 = new Student("Anik", 25, 3.7,"01112");
        Student student2 = new Student("Safat", 25, 3.7,"01112");
        student1.print();
        System.out.println(student1.toString());
        if(student1.equals(student2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }


    @Override
    public void print() {
        
    }
}
