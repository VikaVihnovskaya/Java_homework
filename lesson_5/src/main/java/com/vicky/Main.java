package com.vicky;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(2, "blue");
        map.put(3, "green");
//        map.forEach((k, v) -> System.out.println(k + " " +v + "!"));
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            map.compute(iterator.next(), (k,v) -> v+="!");
        }
        System.out.println(map);


        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "red");
        treeMap.put(2, "blue");
        treeMap.put(3, "green");
        System.out.println(treeMap);
        Set <Integer> keyset = treeMap.keySet();
        while (keyset.size() < 1000) {
            int key = new Random().nextInt(Short.MAX_VALUE);
            treeMap.putIfAbsent(key, "colors");
        }
        System.out.println(treeMap.size());

        System.out.println(treeMap);

    }
}
