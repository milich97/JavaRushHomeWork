package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        d = maxx(a, maxx(b,c));
        if (a == d)
        {
            System.out.print(a + " ");
            if (b > c) System.out.println(b + " " + c);
            else System.out.println(c + " " + b);
        } else
        {
            if (b == d)
            {
                System.out.print(b + " ");
                if (a > c) System.out.println(a + " " + c);
                else System.out.println(c + " " + a);
            } else
            {
                System.out.print(c + " ");
                if (a > b) System.out.println(a + " " + b);
                else System.out.println(b + " " + a);
            }
        }


    }
    public static int maxx(int a, int b)
    {
        if (a > b) return a;
        else return b;
    }
}
