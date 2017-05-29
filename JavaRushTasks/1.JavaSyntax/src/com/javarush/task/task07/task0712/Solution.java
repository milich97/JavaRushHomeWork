package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(bufferedReader.readLine());
        }
        int min = arrayList.get(0).length(), max = min;
        int h, index1 = 0, index2 = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            h = arrayList.get(i).length();
            if (h > max) {
                max = h;
                index1 = i;
            }
            if (h < min) {
                min = h;
                index2 = i;
            }
        }
        if (index1 < index2) System.out.println(arrayList.get(index1));
        else System.out.println(arrayList.get(index2));
    }
}
