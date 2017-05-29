package com.javarush.task.task08.task0827;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        String[] d = new String[3];
        int i = 0;
        Date today = new Date();
        Date firstDay = new Date();
        for (String val : date.split(" ")) {
            d[i] = val;
            i++;
        }
        int month = 0;
        if (d[0].equals("JANUARY")) month = 0;
        if (d[0].equals("FEBRUARY")) month = 1;
        if (d[0].equals("MARCH")) month = 2;
        if (d[0].equals("APRIL")) month = 3;
        if (d[0].equals("MAY")) month = 4;
        if (d[0].equals("JUNE")) month = 5;
        if (d[0].equals("JULY")) month = 6;
        if (d[0].equals("AUGUST")) month = 7;
        if (d[0].equals("SEPTEMBER")) month = 8;
        if (d[0].equals("OCTOBER")) month = 9;
        if (d[0].equals("NOVEMBER")) month = 10;
        if (d[0].equals("DECEMBER")) month = 11;
        today.setMonth(month);
        today.setDate(Integer.parseInt(d[1]));
        today.setYear(Integer.parseInt(d[2]));
        firstDay.setMonth(0);
        firstDay.setDate(1);
        firstDay.setYear(Integer.parseInt(d[2]));
        if ((today.getTime() - firstDay.getTime()) / (24 * 60 * 60 * 1000) % 2 == 0) return true;
        else return false;
    }
}
