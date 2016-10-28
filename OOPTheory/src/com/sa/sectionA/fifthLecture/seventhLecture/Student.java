package com.sa.sectionA.fifthLecture.seventhLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Student extends Person {
    private String studentID;
    private double cgpa;
    public String status;

    public static void main(String[] args) {
        Student student1 = new Student("anik", 25, "0125412", 3.75);
        Student student2 = new Student("safat", 26, "0125542", 3.75);
        if(student1.equals(student2)){
            System.out.println("equal");
        }
        else{
            System.out.println("Not equal");
        }
        student1.print();
        System.out.println(student1.toString());
    }



    @Override
    public boolean equals(Object obj) {
        Student tmStudent = (Student) obj;
        if(this.cgpa == tmStudent.cgpa){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        //return super.toString();
        String res=studentID+" "+cgpa+" "+super.getName();
        return res;
    }

    @Override
    public void print() {

    }

    public Student(String name, int age, String studentID, double cgpa) {
        super(name, age);
        //super();
        //status="active"; //student status access
        super.status="active";
        this.studentID = studentID;
        this.cgpa = cgpa;
    }
}
