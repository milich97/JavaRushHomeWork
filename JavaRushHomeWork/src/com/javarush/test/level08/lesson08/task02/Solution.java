package com.javarush.test.level08.lesson08.task02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{

    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++)
        {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i : set)
        {
            if (i > 10) numbers.add(i);
        }
        for (int i:numbers) removeItem(set,i);
        return set;
    }

    public static void removeItem(HashSet<Integer> set, int value)
    {
        HashSet<Integer> copy = new HashSet<>(set);
        for (int s : copy)
        {
            if (s == value)
                set.remove(s);
        }
    }
}
