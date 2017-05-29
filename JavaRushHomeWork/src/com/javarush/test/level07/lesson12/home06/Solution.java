package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и
заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandD1=new Human();
        grandD1.name="Vova";grandD1.sex=true;grandD1.age=80;grandD1.father=null;grandD1.mother=null;
        Human grandD2=new Human();
        grandD2.name="Iurii";grandD2.sex=true;grandD2.age=71;grandD1.father=null;grandD2.mother=null;
        Human grandB1=new Human();
        grandB1.name="Rita";grandB1.sex=false;grandB1.age=76;grandB1.father=null;grandB1.mother=null;
        Human grandB2=new Human();
        grandB2.name="Luba";grandB2.sex=false;grandB2.age=66;grandB2.father=null;grandB2.mother=null;
        Human dad=new Human();
        dad.name="Iurii";dad.sex=true;dad.age=45;dad.father=grandD1;dad.mother=grandB1;
        Human mom=new Human();
        mom.name="Sveta";mom.sex=false;mom.age=47;mom.father=grandD2;mom.mother=grandB2;
        Human child1=new Human();
        child1.name="Maka";child1.sex=true;child1.age=22;child1.father=dad;child1.mother=mom;
        Human child2=new Human();
        child2.name="Misha";child2.sex=true;child2.age=19;child2.father=dad;child2.mother=mom;
        Human child3=new Human();
        child3.name="Vanya";child3.sex=true;child3.age=15;child3.father=dad;child3.mother=mom;
        System.out.println(grandD1.toString());
        System.out.println(grandD2.toString());
        System.out.println(grandB1.toString());
        System.out.println(grandB2.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());


    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father,mother;


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
