package com.sa.sectionB.fifthLecture.TwentyTwoLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by akashs on 12/18/16.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 2000);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );
            String s = in.readLine();
            System.out.println(s);
            Scanner scanner = new Scanner(System.in);

            while(true) {
                String temp = scanner.nextLine();
                out.println(temp);
                if(temp.equals("end")) break;

                s = in.readLine();
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








