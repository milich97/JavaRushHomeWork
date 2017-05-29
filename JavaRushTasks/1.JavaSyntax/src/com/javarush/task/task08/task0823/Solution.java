package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String ans;
        for (String val : s.split(" ")) {
            ans="";
            ans=val.substring(0,1).toUpperCase();
            ans=ans+val.substring(1,val.length());
            System.out.print(ans+" ");
        }

    }
}
