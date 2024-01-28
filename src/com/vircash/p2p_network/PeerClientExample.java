package com.vircash.p2p_network;// com.vircash.p2p_network.PeerClientExample.java
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeerClientExample {
//    private final int sourcePort;
//    private final int destinationPort;

    Socket peerSocketOrPeerIPAddress;

    public List<Socket> getPeerSocketOrPeerIPAddressList() {
        return peerSocketOrPeerIPAddressList;
    }

    public void setPeerSocketOrPeerIPAddressList(List<Socket> peerSocketOrPeerIPAddressList) {
        this.peerSocketOrPeerIPAddressList = peerSocketOrPeerIPAddressList;
    }

    List<Socket> peerSocketOrPeerIPAddressList;



//    public PeerClientExample(int sourcePort, int destinationPort) {
//        this.sourcePort = sourcePort;
//        this.destinationPort = destinationPort;
//    }

    public void runClient(int destinationPort)
    {

        try  {
            List<Socket> peerIPAddressList=new ArrayList<Socket>();
            peerSocketOrPeerIPAddress = new Socket("localhost", destinationPort);
            peerIPAddressList.add(peerSocketOrPeerIPAddress);
            setPeerSocketOrPeerIPAddressList(peerIPAddressList);
//            setPeerSocketOrPeerIPAddress(peerSocketOrPeerIPAddress);
//            PrintWriter writer = new PrintWriter(peerSocketOrPeerIPAddress.getOutputStream(), true);
//            BufferedReader reader = new BufferedReader(new InputStreamReader(peerSocketOrPeerIPAddress.getInputStream()));
//            BufferedReader readerOut = new BufferedReader(new InputStreamReader(peerSocketOrPeerIPAddress.getInputStream()));

//            Scanner scanner=new Scanner(System.in);
//            System.out.print("Enter message to send: ");
//            String input=scanner.nextLine();

            // Example: Sending a message from the client
//            writer.println("MSG");
            // Example: Receiving a message from the server
//            String serverResponse = reader.readLine();
//            System.out.println("Node " + destinationPort + " says: " + serverResponse);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static Socket sendPeerIPAddress(Socket ipAddress){
//        return ipAddress;
//    }
}
