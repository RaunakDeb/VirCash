package com.vircash.p2p_network;

import java.net.Socket;

public class ContinuousPortChecker {
    public static void main(String[] args) {
        String host = "localhost";  // Change this to your target host
        int startPort = 5000;       // Specify the start of the port range
        int endPort = 5010;         // Specify the end of the port range

        while (true) {
            checkOpenPorts(host, startPort, endPort);
            sleep(5000);  // Sleep for 5 seconds before the next scan
        }
    }

    private static void checkOpenPorts(String host, int startPort, int endPort) {
        System.out.println("Scanning ports on " + host + "...");

        for (int port = startPort; port <= endPort; port++) {
            try (Socket socket = new Socket(host, port)) {
                System.out.println("Port " + port + " is open on " + host);
            } catch (Exception e) {
                // Port is likely closed
            }
        }
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
