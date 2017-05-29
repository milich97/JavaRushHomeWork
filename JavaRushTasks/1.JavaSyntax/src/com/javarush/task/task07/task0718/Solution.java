package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(bufferedReader.readLine());
        }
        int a = 0, index = -1;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if ((arrayList.get(i).length() > arrayList.get(i + 1).length())&& a==0) {
                a = 1;
                index = i;
            }

        }
        if (index!=-1) System.out.println(index+1);


    }
}

