package com.javalesson.second;

import java.util.Arrays;

public class ArraysHomework {

    public static void main(String[] args) {

        invertArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0});

        fillArray();

        changeArray();

        fillDiagonal(5);
        fillDiagonal(11);

        findMaxMin(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -9});

        balanceEqual(new int[]{2, 2, 2, 1, 2, 2});
        balanceEqual(new int[]{2, 2, 2, 2, 2, 2});

        modifyArray(new int[]{1,1,0,0,1,0,1}, 2);
        modifyArray(new int[]{1,1,0,0,1,0,1}, -2);

    }

//    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void invertArray(int[] array) {
        System.out.println("Полученный массив чисел:" + Arrays.toString(array));
        int[] revers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            revers[i] = array[i] == 0 ? 1 : 0;
        }

        System.out.println("Преобразованный массив: " + Arrays.toString(revers));
        System.out.println();
    }

//    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void fillArray() {
        int[] array = new int[8];

        for (int i = 0, filler = 0; i < array.length; i++, filler += 3) {
            array[i] = filler;
        }

        System.out.println("Заполненный массив " + Arrays.toString(array));
        System.out.println();
    }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Полученный массив чисел: " + Arrays.toString(array));

        int[] changedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            changedArray[i] = array[i] < 6 ? array[i] : array[i] * 2;
        }

        System.out.println("Измененный массив чисел: " + Arrays.toString(changedArray));
        System.out.println();
    }

//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void fillDiagonal(int arraySize){
        int[][] array = new int[arraySize][arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i][i] = 1;
            array[i][arraySize - i - 1] = 1;
        }

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

//    5. ** Задать одномерный массив и найти в нем минимальный
//    и максимальный элементы (без помощи интернета);

    public static void findMaxMin(int[] array){
        System.out.println("Полученный массив чисел:" + Arrays.toString(array));

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            min = (min < array[i]) ? min : array[i];
            max = (max > array[i]) ? max : array[i];
        }
        System.out.println("Минимальное значение в массиве: " + min + "\nМаксимальное значение в массиве: " + max);
        System.out.println();
    }

    /* 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.*/

    public static void balanceEqual(int [] array){
        System.out.println("Полученный массив чисел:" + Arrays.toString(array));
        int leftSum = 0, rightSum = 0;
        boolean result = false;

        for (int i = 0; i < array.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }

            for (int j = i; j < array.length; j++) {
                rightSum += array[j];
            }

            if (leftSum == rightSum)
                result = true;
        }
        System.out.println("Равны ли суммы левой и правой частей - " + result);
        System.out.println();
    }

    /*7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.*/

    public static void modifyArray(int[] array, int n) {
        System.out.println("Полученный массив чисел: " + Arrays.toString(array) + " с шагом n = " + n);

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Right
                int step = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = step;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int step = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = step;
            }
        }

        System.out.println("Измененный массив чисел: " + Arrays.toString(array));
        System.out.println();

    }

}
