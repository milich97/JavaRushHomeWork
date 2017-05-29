package com.javarush.test.level04.lesson02.task05;

/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
*/

import static com.javarush.test.level04.lesson02.task05.Solution.Cat.count;

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        count=count+1;

        Cat cat2 = new Cat();
        count=count+1;

        System.out.println("Cats count is " + count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}