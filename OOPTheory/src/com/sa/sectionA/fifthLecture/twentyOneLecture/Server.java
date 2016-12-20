package com.sa.sectionA.fifthLecture.twentyOneLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by akashs on 12/11/16.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2222);
            while(true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected with a client");
                ClientHandler clientHandler = new ClientHandler("Client", clientSocket);
                clientHandler.start();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler extends Thread{
    private String name;
    Socket clientSocket;

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
                s = s.toUpperCase();
                out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}






