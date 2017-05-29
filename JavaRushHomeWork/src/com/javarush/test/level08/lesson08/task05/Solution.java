package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashSet<String> names = new HashSet<>();
        HashSet<String> doubleNames = new HashSet<>();
        for (String i : map.values())
        {
            if (!names.contains(i)) names.add(i);
            else doubleNames.add(i);
        }
        for (String i : doubleNames)
        {
            removeItemFromMapByValue(map, i);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
