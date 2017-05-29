package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private int growth;
    private int colour;

    public Dog(String name)
    {
        this.name = name;
    }

    public Dog(String name, int growth)
    {
        this.name = name;
        this.growth = growth;
    }

    public Dog(String name, int growth, int colour)
    {
        this.name = name;
        this.growth = growth;
        this.colour = colour;
    }

}
