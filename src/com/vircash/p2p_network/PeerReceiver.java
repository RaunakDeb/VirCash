package com.vircash.p2p_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class PeerReceiver implements Runnable {
    private Socket socket;

    public PeerReceiver(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try  {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String receivedMessage = reader.readLine();
                System.out.println("Received message: " + receivedMessage);
//                break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}