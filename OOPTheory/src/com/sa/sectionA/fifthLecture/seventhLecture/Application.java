package com.sa.sectionA.fifthLecture.seventhLecture;

/**
 * Created by akashs on 10/18/16.
 */
public class Application {
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


}
