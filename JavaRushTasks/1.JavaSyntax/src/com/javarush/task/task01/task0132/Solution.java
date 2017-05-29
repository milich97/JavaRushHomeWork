package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int ans = 0;
        while (number > 9) {
            ans += (number % 10);
            number = number / 10;
        }ans += (number % 10);
        return ans;
    }
}