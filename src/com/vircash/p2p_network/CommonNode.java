package com.vircash.p2p_network;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// com.vircash.p2p_network.CommonNode.java
public class CommonNode {
    private final int port;

    private static List<Integer> allNodesPortsList = new ArrayList<>();

    List<Socket> peersIPAddresses;

    public static void main(String[] args) throws Exception {
        int portNumber;

        System.out.println("Enter your port number to be exposed as a Server:");
        Scanner sc=new Scanner(System.in);
        portNumber=sc.nextInt();

        CommonNode commonNode = new CommonNode(portNumber);
        commonNode.startNode();

    }

    public CommonNode(int port) {
        this.port = port;
    }

    public void startNode() throws Exception{
        List<Socket> socketConnectionsList=new ArrayList<>();
        Socket socketConnection;

        // Start server
        Thread serverThread = new Thread(new Runnable() {
            @Override
            public void run() {
                new ServerCodeInNode(port).runServer();
            }
        });

        serverThread.start();
        System.out.println("This node is exposed as a Server on port " + port);


        System.out.print("Enter your port number for node 1: ");
        Scanner sc=new Scanner(System.in);
        int port1=sc.nextInt();

        System.out.print("Enter your port number for node 2: ");
        int port2=sc.nextInt();

        allNodesPortsList.add(port1);
        allNodesPortsList.add(port2);

        System.out.println("Enter message to send to peers: ");
        String msg=sc.nextLine();

        sc.close();

        if(msg!=null){
            for (int i = 0; i < allNodesPortsList.size(); i++)
            {
                if (port != allNodesPortsList.get(i))
                {
                    final int finalOtherPort = allNodesPortsList.get(i); // Make it final
                    Thread clientThread = new Thread(new Runnable()
                    {
                        @Override
                        public void run() {
                            new PeerClientExample().runClient(finalOtherPort,msg);
                        }
                    });
                    clientThread.start();
//                peersIPAddresses=new PeerClientExample().peerSocketOrPeerIPAddressList;
                }
            }
        }

//        System.out.println("Connected to nodes: "+allNodesPortsList);
//        new GetSocketConnection().start();
//        System.out.println("Peers IP Addresses: "+new PeerClientExample().getPeerSocketOrPeerIPAddressList());

    }
}
