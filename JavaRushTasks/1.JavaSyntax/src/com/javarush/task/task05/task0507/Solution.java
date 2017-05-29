package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> mas = new ArrayList<>();

        int a = 0;
        while (a != -1) {
            a = scanner.nextInt();
            mas.add(a);
        }
        double ans = 0;
        for (int i = 0; i < mas.size(); i++)
            ans = ans + mas.get(i);
        ans++;
        ans = ans / (mas.size()-1);
        System.out.println(ans);
    }
}

