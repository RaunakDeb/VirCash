package com.vircash.p2p_network;

import java.util.ArrayList;
import java.util.List;

public class RecordOfAllNodesPorts extends Thread {

    int nodePort;
    List<Integer> allNodesPortsList;

    public List<Integer> getAllNodesPortsList() {
        return allNodesPortsList;
    }


    public RecordOfAllNodesPorts(int nodePort) {
        this.nodePort=nodePort;
    }

    @Override
    public void run() {
        allNodesPortsList=new ArrayList<Integer>();
        allNodesPortsList.add(nodePort);
    }


}
