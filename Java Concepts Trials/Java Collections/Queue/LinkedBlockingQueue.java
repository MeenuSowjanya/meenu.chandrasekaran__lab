package com.Collections.queue;


import java.util.BlockingQueue;

public class LinkedBlockingQueueEx{
    public static void main(String[] args) {

        //can be unbounded
        BlockingQueue <String> names=new LinkedBlockingQueue<>();
        names.add("Meenu");
        names.add("Sowjee");
        System.out.println(names);
    
    
    }
}
