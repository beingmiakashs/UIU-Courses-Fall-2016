package com.sa.sectionB.fifthLecture.seventeenLecture;

import java.io.*;

/**
 * Created by akashs on 12/1/16.
 */
public class FileIOSolution {
    public static void main(String[] args) throws Exception {
//        FileInputStream fin = new FileInputStream("input.txt");
//        FileOutputStream fout = new FileOutputStream("output.txt");
//
//        while(true){
//            int n = fin.read();
//            if(n==-1) break;
//            fout.write(n);
//        }
//        fin.close();
//        fout.close();

        File f = new File("input.txt");
        FileReader fileReader = new FileReader(f);
        FileWriter fileWriter = new FileWriter("output.txt");

//        while(true){
//            int n = fileReader.read();
//            if(n==-1) break;
//            fileWriter.write(n);
//        }
//        fileReader.close();
//        fileWriter.close();

        BufferedReader bin = new BufferedReader(fileReader);
        BufferedWriter bout = new BufferedWriter(fileWriter);

        while(true){
            String s = bin.readLine();
            if(s==null) break;
            bout.write(s);
        }
        bout.close();

    }
}





















