package task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //doTask1();
        //doTask2();
        //doTask3();
        //doTask4();

        //int[] array= doTask5(10, 55);
        //printArray(array);

    }

    /**
     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    private static int[] doTask5(int len, int initialValue) {
        int[] array = {};
        for (int i = 0; i < len; i++) {
            array = Arrays.copyOf(array, i+1);
            array[i] = 55;
        }
        return array;
    }


    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    private static void doTask4() {
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (i + j + 1 == array.length) {
                    array[i][j] = 1;
                }
            }
        }

        printArray(array);
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void doTask3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        printArray(array);

    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    private static void doTask2() {
        int[] array = {};

        printArray(array);

        for (int i = 1; i <= 100; i++) {
            array = Arrays.copyOf(array, i);
            array[i-1] = i;
        }

        printArray(array);

    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void doTask1() {
        int[] ar_bit = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        printArray(ar_bit);

        for (int i = 0; i < ar_bit.length; i++) {
            if (ar_bit[i] == 1) {
                ar_bit[i] = 0;
            }
            else {
                ar_bit[i] = 1;
            }
        }

        printArray(ar_bit);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            if (i != 0 && i % 20 == 0) {
                System.out.println("...");
            }
        }
        System.out.println();
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
