package com.sa.sectionB.fifthLecture.TwentyTwoLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by akashs on 12/18/16.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2000);
            while(true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("A client is connected.");

                ClientHandler client = new ClientHandler("Client", clientSocket);
                client.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler extends Thread{
    public String name;
    public Socket clientSocket;

    public ClientHandler(String name, Socket clientSocket) {
        super(name);
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );
            out.println("Welcome to my server");

            while(true) {
                String s = in.readLine();
                if(s.equals("end")) break;
                System.out.println("Input string" + s);
                s = s.toUpperCase();
                out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}





