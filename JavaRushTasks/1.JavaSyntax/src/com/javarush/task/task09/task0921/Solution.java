package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferedReader.readLine();

            while (true) {
                arrayList.add(Integer.parseInt(s));
                s = bufferedReader.readLine();
            }
        } catch (NumberFormatException e) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        } catch (IOException e) {

        }
    }
}
