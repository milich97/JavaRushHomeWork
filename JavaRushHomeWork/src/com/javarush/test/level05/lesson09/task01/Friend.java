package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{

    private String friendName;
    private int age;
    private int sex;

    public Friend(String name)
    {
        this.friendName = name;
    }

    public Friend(String name, int age)
    {
        this.friendName = name;
        this.age = age;
    }

    public Friend(String name, int age, int sex)
    {
        this.friendName = name;
        this.age = age;
        this.sex = sex;
    }

}