package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> a1 = new ArrayList<>();
        ArrayList<Character> a2 = new ArrayList<>();
        for (String s : reader.readLine().split("")) {
            char c = s.toCharArray()[0];
            if (isVowel(c)) {
                a1.add(c);
            } else {
                if (c != ' ') {
                    a2.add(c);
                }
            }
        }
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i) + " ");

        }
        System.out.println();
        for (int i = 0; i < a2.size(); i++) {
            System.out.print(a2.get(i) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}