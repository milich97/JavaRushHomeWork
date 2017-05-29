package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String friendName;
    private int age;
    private int sex;

    public void initialize(String name)
    {
        this.friendName = name;
    }

    public void initialize(String name, int age)
    {
        this.friendName = name;
        this.age = age;
    }

    public void initialize(String name, int age, int sex)
    {
        this.friendName = name;
        this.age = age;
        this.sex = sex;
    }
}
