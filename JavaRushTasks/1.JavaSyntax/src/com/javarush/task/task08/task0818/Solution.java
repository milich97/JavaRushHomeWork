package com.javarush.task.task08.task0818;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("Ivanov" + i, 100 * i);
        }
        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String name : map.keySet()) {
            if (map.get(name) < 500) arrayList.add(name);

        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> h = createMap();
        removeItemFromMap(h);
        //System.out.println(h.size());
    }
}