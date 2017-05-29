package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int max = 0, counter = 0;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) == arrayList.get(i + 1)) {
                counter++;
            } else {
                if (counter > max) max = counter;
                counter = 0;
            }
        }
        if (counter > max) max = counter;
        System.out.println(max + 1);

    }
}