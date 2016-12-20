package com.sa.sectionB.fifthLecture.eigthTeenLecture;

import java.util.*;

/**
 * Created by akashs on 12/4/16.
 */
public class CollectionSolution {
    public static void main(String[] args) {
        int a = 20;
        Integer b = new Integer(30);
        a = b;
        b = a;

        LinkedList<Integer> ar = new LinkedList<Integer>();
        ar.add(16);
        ar.add(10);
        ar.add(1, 12);
        ar.add(-15);
        //ar.add(new Student("Anik", 152));

        Collections.sort(ar);

        int len = ar.size();
        for(int i=0;i<len;i++){
            int temp =  ar.get(i);
            System.out.println(temp);
        }

        for(int temp : ar){
            System.out.println(temp);
        }

        ar.remove(new Integer(15));

        Iterator<Integer> it = ar.iterator();
        while(it.hasNext()) {
            int temp = it.next();
            System.out.println(temp);
        }

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Swapnil", 30));
        students.add(new Student("Towhid", 25));

        Collections.sort(students);

        for(Student st : students){
            System.out.println(st.whateveAttribute+ " "+st.id);
        }

        HashMap<String, Double> table = new HashMap<String, Double>();
        table.put("anik", 3.98);
        table.put("swapnil", 3.7);

        System.out.println(table.get("swapnil"));
        table.put("swapnil", 3.8);
    }
}

class Student implements Comparable<Student>{

    int id;
    String whateveAttribute;

    public Student(String name, int id) {
        this.whateveAttribute = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {

        return this.whateveAttribute.compareTo(o.whateveAttribute);
//        if(this.id > o.id){
//            return 1;
//        }
//        else if(this.id==o.id){
//            return 0;
//        }
//        else{
//            return -1;
//        }
    }
}
















