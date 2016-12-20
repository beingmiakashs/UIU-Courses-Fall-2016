package com.sa.sectionG.SecondLab.SeventhLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by akashs on 11/27/16.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("127.0.0.1",8000);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );

            String s = in.readLine();
            System.out.println(s);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




