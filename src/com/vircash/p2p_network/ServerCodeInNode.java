package com.vircash.p2p_network;

import java.io.*;
import java.net.*;

import java.net.Socket;

public class ServerCodeInNode {
    private final int port;

//    public static Socket clientSocketConnection;

    public ServerCodeInNode(int port) {
        this.port = port;
    }

    public void runServer() {
//        System.out.println("This node is exposed as a Server on port " + port);

        try  {
            ServerSocket serverSocket = new ServerSocket(port);
//            System.out.println("Server socket created");

            while (true) {
                try(Socket clientSocketConnection = serverSocket.accept()) {
//                    System.out.println("Waiting for a new connection...");
//                    Socket clientSocketConnection = serverSocket.accept();

                    try {
                        Thread.sleep(9000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if(clientSocketConnection.getInputStream()!=null){
                        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocketConnection.getInputStream()));
                        String receivedString = reader.readLine();

//                        if(receivedString!=null || !receivedString.equals("") || !receivedString.isEmpty())
                        System.out.println("Received string from client: " + receivedString);
                    }

//                    clientSocketConnection=cSocketConnection;
//                    System.out.println("New connection accepted: " + clientSocket);

                    // Create separate threads for sending and receiving messages
//                    if(clientSocketConnection.isConnected()){
//                        System.out.println(clientSocketConnection+" is connected");
//                    }
//                    Thread senderThread = new Thread(new PeerSender(clientSocketConnection));
//                    Thread receiverThread = new Thread(new PeerReceiver(clientSocketConnection));
//
//                    // Start the threads
//                    receiverThread.start();
//                    senderThread.start();

//                    System.out.println("Threads started for the new connection.");
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}















