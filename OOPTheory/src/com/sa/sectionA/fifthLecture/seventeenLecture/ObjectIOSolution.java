package com.sa.sectionA.fifthLecture.seventeenLecture;

import java.io.*;

/**
 * Created by akashs on 12/1/16.
 */
public class ObjectIOSolution {

    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("objectOut");
        ObjectOutputStream objectOut = new ObjectOutputStream(fout);

        Student st = new Student("Safat", 25);
        objectOut.writeObject(st);

        FileInputStream fin = new FileInputStream("objectOut");
        ObjectInputStream objectIn = new ObjectInputStream(fin);

        Student temp = (Student) objectIn.readObject();
        System.out.println(temp.id+" "+temp.name);

    }
}
