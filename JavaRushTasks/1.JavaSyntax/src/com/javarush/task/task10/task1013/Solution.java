package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private byte iq;
        private float height;
        private String name;
        private short aShort;
        private double d;

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, byte iq) {
            this.age = age;
            this.iq = iq;
        }

        public Human(int age, byte iq, float height) {
            this.age = age;
            this.iq = iq;
            this.height = height;
        }

        public Human(int age, byte iq, float height, String name) {
            this.age = age;
            this.iq = iq;
            this.height = height;
            this.name = name;
        }

        public Human(int age, byte iq, float height, String name, short aShort) {
            this.age = age;
            this.iq = iq;
            this.height = height;
            this.name = name;
            this.aShort = aShort;
        }

        public Human(int age, byte iq, float height, String name, short aShort, double d) {
            this.age = age;
            this.iq = iq;
            this.height = height;
            this.name = name;
            this.aShort = aShort;
            this.d = d;
        }

        public Human(byte iq) {
            this.iq = iq;
        }

        public Human(float f) {
            this.height = f;
        }

        public Human(String s) {
            this.name = s;
        }

        public Human(short s) {
            {
                this.aShort = s;
            }
        }

    }
}
