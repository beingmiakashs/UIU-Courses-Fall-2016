package com.sa.sectionA.fifthLecture.twentyOneLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by akashs on 12/11/16.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 2222);
            System.out.println("Connected with server");
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );
            String s = in.readLine();
            System.out.println(s);
            Scanner sc = new Scanner(System.in);
            while(true) {
                String line = sc.nextLine();
                out.println(line);
                if (line.equals("end")) break;

                String res = in.readLine();
                System.out.println(res);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
