package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        while (s.length() != 7) {

            if (s.substring(0, 1).equals(" ")) {
                System.out.println(s.substring(1));
            } else
                System.out.println(s);
            s = s.substring(1);
        }

        //напишите тут ваш код
    }

}
