package com.javarush.task.task06.task0606;

import java.io.*;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(bufferedReader.readLine());
        eo(a);
        System.out.println("Even: "+even+ " Odd: "+odd);
    }

    private static void eo(int a) {
        if ((a%10)%2==0) even++;
        else odd++;
        a=a/10;
        if (a>0) eo(a);
    }
}
