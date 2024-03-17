package com.vircash.p2p_network;

import com.vircash.p2p_network.PeerReceiver;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class PeerSender implements Runnable {
    private Socket socket;

    public PeerSender(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            Scanner userInputScanner = new Scanner(System.in);

//            while (true) {
                System.out.print("Enter message to send: ");
                String message = userInputScanner.nextLine();
                writer.println(message);
                writer.close();

//            Thread receiverThread = new Thread(new PeerReceiver(socket));
//            receiverThread.start();
//            }
        }
        catch (Exception e) {
//            e.printStackTrace();
        }
    }
}