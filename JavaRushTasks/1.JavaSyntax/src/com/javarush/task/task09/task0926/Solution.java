package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> a = new ArrayList<>();
        int[] a1 = {10, 20, 30, 3, 4};
        int[] a2 = {10, 20};
        int[] a3 = {10, 20, 30, 3};
        int[] a4 = {10, 20, 30, 3, 4, 4, 7};
        int[] a5 = {};
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);
        return a;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
