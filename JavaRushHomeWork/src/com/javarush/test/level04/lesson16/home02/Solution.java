package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a, b, c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        if ((a >= b && b >= c) || (c >= b && b >= a)) System.out.println(b);
        if ((c>=a && a>=b) || (b>=a && a>=c)) System.out.println(a);
        if ((a>=c && c>=b) || (b>=c && c>=a)) System.out.println(c);;

    }
}
