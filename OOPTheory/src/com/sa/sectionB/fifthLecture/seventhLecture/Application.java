package com.sa.sectionB.fifthLecture.seventhLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Application {
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
}
