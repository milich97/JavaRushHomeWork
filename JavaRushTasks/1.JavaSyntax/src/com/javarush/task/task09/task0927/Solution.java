package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3");
        Cat cat4 = new Cat("cat4");
        Cat cat5 = new Cat("cat5");
        Cat cat6 = new Cat("cat6");
        Cat cat7 = new Cat("cat7");
        Cat cat8 = new Cat("cat8");
        Cat cat9 = new Cat("cat9");
        Cat cat10 = new Cat("cat10");
        HashMap<String, Cat> m = new HashMap();
        m.put(cat1.name, cat1);
        m.put(cat2.name, cat2);
        m.put(cat3.name, cat3);
        m.put(cat4.name, cat4);
        m.put(cat5.name, cat5);
        m.put(cat6.name, cat6);
        m.put(cat7.name, cat7);
        m.put(cat8.name, cat8);
        m.put(cat9.name, cat9);
        m.put(cat10.name, cat10);

        return m;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for (Cat value: map.values()){
            set.add(value);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
