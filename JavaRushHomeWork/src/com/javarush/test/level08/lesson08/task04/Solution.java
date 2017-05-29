package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{


    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Lobachev Misha", new Date("JULY 21 1997"));
        map.put("Lobachev Vanya", new Date("OCTOBER 1 2001"));
        map.put("Lobachev Yurii", new Date("JUNE 19 1971"));
        map.put("Lobacheva Sveta", new Date("JULY 8 1969"));
        map.put("Kulikov Maka", new Date("JANUARY 25 1994"));
        map.put("Malzheva Rita", new Date("APRIL 17 1940"));
        map.put("Kulikov Yurii", new Date("MARCH 3 1945"));
        map.put("Lobacheva Tanya", new Date("NOVEMBER 9 1995"));
        map.put("Lobachev Zhenya", new Date("APRIL 11 1970"));
        map.put("Lobacheva Zhenya", new Date("SEPTEMBER 11 1972"));

        return map;


    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashSet<Date> summer = new HashSet<>();
        for (Date i : map.values())
        {

            if (i.getMonth() == 6 || i.getMonth() == 7 || i.getMonth() == 5) summer.add(i);

        }
        for (Date i : summer)
            removeItemFromMapByValue(map, i);

    }

    public static void removeItemFromMapByValue(HashMap<String, Date> map, Date value)
    {
        HashMap<String, Date> copy = new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
