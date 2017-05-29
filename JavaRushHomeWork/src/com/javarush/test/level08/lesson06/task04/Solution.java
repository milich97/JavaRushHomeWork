//package com.javarush.test.level08.lesson06.task04;
//
//import java.util.*;
//
///* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
//Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
//Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
//*/
//
//public class Solution
//{
//    public static void main(String[] args)
//    {
//        Set set=createSet();
//        for (String text:set){
//
//        }
//    }
//
//
//    public static HashSet<Integer> createSet()
//    {
//        Set set = new HashSet();
//        for (int i = 0; i < 20; i++)
//        {
//            set.add(i);
//        }
//        return (HashSet) set;
//
//    }
//
//    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
//    {
//        for (int i : set)
//        {
//            if (i > 10) set.remove(i);
//        }
//        return set;
//    }
//
//
//}
