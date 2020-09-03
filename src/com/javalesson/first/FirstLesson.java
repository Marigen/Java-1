package com.javalesson.first;

public class FirstLesson {

    //Примитивные типы данных:
    //1. Целочиленные
    byte firstType = 1;
    short secondType = 2;
    int thirdType = 4;
    long forthType = 8L;

    //2. Вещественные, с плавающей точкой
    float fifthType = 4.0f;
    double sixthType = 8.0;

    //3. Символьный тип данных
    char seventhType = 't';

    //Ссылочный тип данных
    String eighthType = "Какая-то строка любого размера";

    //4. Логический тип данных
    boolean yes = true;
    boolean no = false;

    public static void main(String[] args) {

        System.out.println(secondTask(5, 6, 8, 10));

        System.out.println(thirdTask(5, 10));
        System.out.println(thirdTask(10, 15));

        fourthTaskSecondVariant(10, 20);
        fourthTaskSecondVariant(5, 6);

        fifthTask(5);
        fifthTask(-1);

        sixthTask(-2);
        sixthTask(2);

        seventhTask("Илья");
        seventhTask("Igor");

        eighthTask(4);
        eighthTask(3);
        eighthTask(108);
        eighthTask(100);
        eighthTask(200);
        eighthTask(400);
        eighthTask(800);
        eighthTask(900);

    }

    public static int secondTask(int a, int b, int c, int d) {
        return a * (b + (c / d));
        //TODO Стоит ли в return выносить выражение?
        // Или лучше объявить новую переменную, равную этому выражению и возвращать ее?
    }

    public static String thirdTask(int a, int b) {
        int c = a + b;

        String result = c >= 10 & c <= 20 ? "Сумма чисел " + a + " и " + b + " удовлетворяет условию задачи" :
                "Сумма чисел " + a + " и " + b + " не удовлетворяет условию задачи";

        return result;
    }

    public static void fourthTaskSecondVariant(int a, int b) {
        int c = a + b;

        if (c >= 10 & c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void fifthTask(int a) {
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    public static void sixthTask(int a) {
        if (a < 0) {
            System.out.println(true);
        }
    }

    public static void seventhTask(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void eighthTask(int a) {
        if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
            System.out.println(a + " - високосный год");
        } else {
            System.out.println(a + " - невисокосный год");
        }
    }

}
