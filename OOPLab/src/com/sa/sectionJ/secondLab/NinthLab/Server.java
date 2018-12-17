package com.sa.sectionJ.secondLab.NinthLab;

/**
 * Created by akashs on 12/21/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by akashs on 11/27/16.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);

        while(true) {
            Socket clientSocket = serverSocket.accept();
            ClientHandler client = new ClientHandler(clientSocket, "client");
        }
    }
}

class ClientHandler implements Runnable{

    private Socket clientSocket;
    private String name;
    public Thread th;

    public ClientHandler(Socket clientSocket, String name) {
        this.clientSocket = clientSocket;
        this.name = name;

        th = new Thread(this, name);
        th.start();
    }

    @Override
    public void run() {
        try{
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );

            while (true) {
                String s = in.readLine();
                if (s.equals("end")) break;

                StringBuilder sb = new StringBuilder(s);
                sb = sb.reverse();
                s = sb.toString();
                out.println(s);
            }
        }catch (Exception ex){

        }
    }
}



















