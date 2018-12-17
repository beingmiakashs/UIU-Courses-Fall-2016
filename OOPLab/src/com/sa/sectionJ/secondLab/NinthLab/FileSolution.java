package com.sa.sectionJ.secondLab.NinthLab;

import java.io.*;

/**
 * Created by akashs on 12/21/16.
 */
public class FileSolution {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("input.txt");
            FileWriter w = new FileWriter("output.txt");

            BufferedReader in = new BufferedReader(r);
            BufferedWriter out = new BufferedWriter(w);

            while(true){
                String s = in.readLine();
                if(s == null) break;
                out.write(s);
            }
            in.close();
            out.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}







