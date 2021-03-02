package ru.javabegin.training.fastjava2.algorithmization.oneDimensionalArrays;

import java.util.Scanner;
//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчи­тать количество замен.
public class TwoTask {
    public void credited() {
        System.out.println("Введите число Z");
        Scanner in = new Scanner(System.in);
        int Z = in.nextInt();
        int[] array = new int[]{5, 7, 8, 4, 6, 46, 1, 0, 2, 15};
        System.out.print("Старый массив элементов: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println();
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > Z) {
                array[j] = Z;
                counter++;
            }

        }
        System.out.println("Количество замен: " + counter);
        System.out.print("Новый массив элементов: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}