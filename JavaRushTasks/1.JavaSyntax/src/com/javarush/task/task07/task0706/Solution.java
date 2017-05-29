package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[15];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = 0, a2 = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0; i < a.length; i += 2) {
            a1 = a1 + a[i];
        }
        for (int i = 1; i < a.length; i += 2) {
            a2 = a2 + a[i];
        }
        if (a2 > a1) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        if (a1 > a2) System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
