package com.vircash.p2p_network;

import java.net.Socket;

public class GetSocketConnection extends Thread{

    Socket socketConnection;

    @Override
    public void run()
    {
        while(true)
        {
//            socketConnection= ServerCodeInNode.sendSocketConnection();
            System.out.println("Connections: "+socketConnection);
//            try {
//                Thread.sleep(4000);
//            }
//            catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if(socketConnection!=null)
//                break;
        }

//        System.out.println("Connections: "+socketConnection);

//        Thread receiverThread = new Thread(new PeerReceiver(socketConnection));
//        receiverThread.start();
//
//        Thread senderThread = new Thread(new PeerSender(socketConnection));
//        senderThread.start();
    }
}
