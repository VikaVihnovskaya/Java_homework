package com.vicky;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
//     static Hashmap<Integer, Object> map = new HashMap<>();
//     static final Object OBJ = new Object();

    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(2);
        mySet.add(6);
        mySet.add(37);
        System.out.println(mySet);
        mySet.sort();
        System.out.println(mySet);

    }

}

class MySet {
    private Map<Integer, Object> map = new HashMap<>();
    private final Object OBJ = new Object();

    @Override
    public String toString() {
        return map.keySet().stream()
                .map(o -> o.toString())
                .collect(Collectors.joining(","));
    }

    public boolean add(Integer i) {
        return map.put(i, OBJ) != null ? true : false;
    }

    public void sort() {
        Map<Integer, Object> result = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        this.map = result;
    }

    public Integer size() {
        return map.keySet().size();
    }

    public Integer get(Integer a) {
        return (Integer) map.keySet().toArray()[a];
    }
}