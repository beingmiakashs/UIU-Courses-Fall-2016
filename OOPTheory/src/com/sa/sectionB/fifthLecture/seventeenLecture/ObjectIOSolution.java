package com.sa.sectionB.fifthLecture.seventeenLecture;

import java.io.*;

/**
 * Created by akashs on 12/1/16.
 */
public class ObjectIOSolution {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("objectIn");
            ObjectOutputStream obOut = new ObjectOutputStream(fout);

            Book book = new Book("OOP Theory", 256.89);
            obOut.writeObject(book);

            obOut.close();
            fout.close();

            FileInputStream fin = new FileInputStream("objectIn");
            ObjectInputStream obIn = new ObjectInputStream(fin);

            Book temp = (Book)obIn.readObject();
            System.out.println(temp.name+" "+temp.price);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




















