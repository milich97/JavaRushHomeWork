package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a, b, c, d;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());
        a = maxx(a,b);
        a=maxx(a,c);
        a=maxx(a,d);
        System.out.println(a);

    }

    public static int maxx(int a, int b)
    {
        if (a > b) return a;
        else return b;
    }
}
