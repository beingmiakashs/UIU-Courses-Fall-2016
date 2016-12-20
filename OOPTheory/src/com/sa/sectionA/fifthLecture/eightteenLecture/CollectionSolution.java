package com.sa.sectionA.fifthLecture.eightteenLecture;

import java.util.*;

/**
 * Created by akashs on 12/4/16.
 */
public class CollectionSolution {
    public static void main(String[] args) {
        int a = 5;
        Integer A = 15;
        A = a;
        a = A;
        a = Integer.parseInt("45448");

//        LinkedList<Integer> ar = new LinkedList<Integer>();
//        ar.add(15);
//        ar.add(11);
//        ar.add(1, 10);
//        ar.add(-5);
//
//        Collections.sort(ar);
//
//
//        for(int i=0;i<ar.size();i++){
//            int temp = ar.get(i);
//            System.out.println(temp);
//        }
//
//        for(int temp : ar){
//            System.out.println(temp);
//        }
//
//        Iterator<Integer> it = ar.iterator();
//        while(it.hasNext()){
//            int temp = it.next();
//            System.out.println(temp);
//        }
//
//        ar.remove("A");
//
//        for(int i=0;i<ar.size();i++){
//            Object temp = ar.get(i);
//            System.out.println(temp);
//        }

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("0124",3.89));
        students.add(new Student("0123",3.70));
        students.add(new Student("0115",3.35));

        Collections.sort(students);
        Collections.reverse(students);

        for(Student st : students){
            System.out.println(st.cgpa+" "+st.id);
        }

        Hashtable<String, Double> table = new Hashtable<String, Double>();
        table.put("safat", 3.89);
        table.put("anik", 3.93);

        Hashtable<Student, Student> stTable = new Hashtable<Student, Student>();

        double d = table.get("anik");
        System.out.println(d);


    }
}


class Student implements Comparable<Student>{
    String id;
    double cgpa;

    public Student(String id, double cgpa) {
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
//        if(this.cgpa > o.cgpa){
//            return 1;
//        }
//        else if(this.cgpa==o.cgpa){
//            return 0;
//        }
//        else{
//            return -1;
//        }

    }
}











