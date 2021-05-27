package ru.javabegin.training.fastjava2.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class FiveTask {
    public void mainMethod() {
        System.out.println("Введите число размер массива");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        System.out.print("Из массива элементов: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Вывели на печать только те где аi > i: ");
            for (int i = 0; i < size; i++) {
                if (array[i] > i)
                    System.out.print(array[i] + " ");
            }

    }
}
