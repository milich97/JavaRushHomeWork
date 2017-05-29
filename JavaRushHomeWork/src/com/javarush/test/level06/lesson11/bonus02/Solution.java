package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine();
        Cat catGrandPa = new Cat(grandPaName);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName);

        String paName = reader.readLine();
        Cat catFather = new Cat(paName, catGrandPa, null);

        String maName = reader.readLine();
        Cat catMother = new Cat(maName, null, catGrandMa);

        String son = reader.readLine();
        Cat catSon = new Cat(son, catFather, catMother);

        String daughter = reader.readLine();
        Cat catDaughter = new Cat(daughter, catFather, catMother);

        System.out.println(catGrandPa);
        System.out.println(catGrandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parentDad;
        private Cat parentMom;

        Cat(String name)
        {
            this.name = name;
            this.parentDad=null;
            this.parentMom=null;
        }
//
//        Cat(String name, Cat parentMom)
//        {
//            this.name = name;
//            this.parentDad = null;
//            this.parentMom = parentMom;
//        }
//
//        Cat(Cat parentDad, String name)
//        {
//            this.name = name;
//            this.parentDad = parentDad;
//            this.parentMom = null;
//        }

        Cat(String name, Cat parentDad, Cat parentMom)
        {
            this.name = name;
            this.parentMom = parentMom;
            this.parentDad = parentDad;
        }

        @Override
        public String toString()
//        {
//            String data = "Cat name is " + name;
//            if (parentMom == null)
//            {
//                data = data + ", no mother ";
//            } else data = data + ", mother is " + parentMom.name;
//            if (parentDad == null)
//            {
//                data = data + ", no father ";
//            } else data = data + ", father is " + parentDad.name;
//
//            return data;
//
//
//        }
        {
            if ((parentMom == null) && (parentDad == null))
            {return "Cat name is " + name + ", no mother, no father ";}
            else if ((parentMom==null)&&(parentDad!=null))
            {
                return "Cat name is " + name + ", no mother, father is " + parentDad.name;
            }
            else if ((parentMom!=null)&&(parentDad==null))
            {
                return "Cat name is " + name + ", mother is " + parentMom.name + ", no father";
            }
            else
                return "Cat name is " + name + ", mother is " + parentMom.name + ", father is " + parentDad.name;
        }
    }

}
