package ru.javabegin.training.fastjava2.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class EightTask {


    static int arrayB[];
    private static int min;
    private static int counter = 0;

    public static void runMethod() {
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("Из массива элементов: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Убираем наименьший элемент: ");
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (elem < min) {
                min = elem;
            }
        }
        System.out.println(min);
        for (int elem : array) {
            if (elem == min) {
                counter++;
            }
        }
        int b = 0;
        arrayB = new int[array.length - counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
//                k++;

            } else {
                arrayB[b] = array[i];
                b++;
            }

        }
        System.out.println();
        System.out.print("Новый массив без min элементов: ");
        for (int element : arrayB) {
            System.out.print(element + " ");
        }
    }
}




