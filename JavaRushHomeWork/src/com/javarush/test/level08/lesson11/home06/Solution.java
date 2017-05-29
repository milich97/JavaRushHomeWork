package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human h1 = new Human();
        Human h2 = new Human();
        Human h3 = new Human();
        Human h4 = new Human();
        Human h5 = new Human();
        Human h6 = new Human();
        Human h7 = new Human();
        Human h8 = new Human();
        Human h9 = new Human();
        h1.name = "Misha";
        h2.name = "Vanya";
        h3.name = "Maka";
        h1.sex = true;
        h2.sex = true;
        h3.sex = true;
        h1.age = 19;
        h2.age = 15;
        h3.age = 22;
        h4.name = "Iurii";
        h5.name = "Sveta";
        h4.sex = true;
        h5.sex = false;
        h4.age = 45;
        h5.age = 47;

        h1.children = new ArrayList<>();
        h2.children = new ArrayList<>();
        h3.children = new ArrayList<>();
        h4.children = new ArrayList<>();
        h5.children = new ArrayList<>();
        h6.children = new ArrayList<>();
        h7.children = new ArrayList<>();
        h8.children = new ArrayList<>();
        h9.children = new ArrayList<>();
        h4.children.add(h1);
        h4.children.add(h2);
        h4.children.add(h3);
        h5.children.add(h1);
        h5.children.add(h2);
        h5.children.add(h3);
        h6.name = "Rita";
        h7.name = "Vova";
        h8.name = "Lubov";
        h9.name = "Iurii";
        h6.sex = false;
        h7.sex = true;
        h8.sex = false;
        h9.sex = true;
        h6.age = 76;
        h7.age = 80;
        h8.age = 66;
        h9.age = 71;
        h6.children.add(h4);
        h7.children.add(h4);
        h8.children.add(h5);
        h9.children.add(h5);
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h5.toString());
        System.out.println(h6.toString());
        System.out.println(h7.toString());
        System.out.println(h8.toString());
        System.out.println(h9.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
