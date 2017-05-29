package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Lobachev", "Misha");
        map.put("Lobachev1", "Vanya");
        map.put("Lobachev2", "Yurii");
        map.put("Lobacheva", "Sveta");
        map.put("Kulikov", "Maka");
        map.put("Malzheva", "Rita");
        map.put("Kulikov1", "Yurii");
        map.put("Lobacheva1", "Tanya");
        map.put("Lobachev3", "Zhenya");
        map.put("Lobacheva2", "Zhenya");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int res = 0;
        for (String i:map.values()             )
        {
            if (name.equals(i)) res++;
        }
        return res;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int res = 0;
        for (String i:map.keySet()             )
        {
            if (lastName.equals(i)) res++;
        }
        return res;

    }
}
