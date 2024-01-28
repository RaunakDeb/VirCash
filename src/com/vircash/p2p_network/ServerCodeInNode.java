package com.vircash.p2p_network;

import java.io.*;
import java.net.*;

import java.net.Socket;

public class ServerCodeInNode {
    private final int port;

    public static Socket clientSocketConnection;

    public ServerCodeInNode(int port) {
        this.port = port;
    }

    public void runServer() {
//        System.out.println("This node is exposed as a Server on port " + port);

        try  {
            ServerSocket serverSocket = new ServerSocket(port);
//            System.out.println("Server socket created");

            while (true) {
                try {
//                    System.out.println("Waiting for a new connection...");
                    Socket cSocketConnection = serverSocket.accept();
                    clientSocketConnection=cSocketConnection;
//                    System.out.println("New connection accepted: " + clientSocket);

                    // Create separate threads for sending and receiving messages
//                    if(clientSocketConnection.isConnected()){
//                        System.out.println(clientSocketConnection+" is connected");
//                    }
//                    Thread senderThread = new Thread(new com.vircash.p2p_network.PeerSender(clientSocketConnection));
//                    Thread receiverThread = new Thread(new com.vircash.p2p_network.PeerReceiver(clientSocketConnection));
//
//                    // Start the threads
//                    senderThread.start();
//                    receiverThread.start();

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

//    public Socket getClientSocket(Socket clientSocketConnection){
//        return clientSocketConnection;
//    }

    public static Socket sendSocketConnection(){
        return clientSocketConnection;
    }
}















