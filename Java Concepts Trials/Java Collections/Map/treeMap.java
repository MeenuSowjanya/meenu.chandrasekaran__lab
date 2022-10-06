package com.Collections.map;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap <Integer,String> map=new TreeMap<>();

        //inserting entries
        map.put(1,"Meenu");
        map.put(2,"Sowjee");
        map.put(1,"Rishi");
        map.put(2,"Smile");
        map.put(3,"Vaish");

        //if enters value in same key it will be replaced.

        System.out.println(map);//prints the map
    }
}

