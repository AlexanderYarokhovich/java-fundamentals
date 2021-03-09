package ru.javabegin.training.fastjava2.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class FourTask {
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
        int imax = 0;
        int imin = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > array[imax])
                imax = i;
            else if (array[i] < array[imin])
                imin = i;
        }
        int temp = 0;
        System.out.println();
        System.out.println("max " + array[imax]);
        System.out.println("min  " + array[imin]);
        temp = array[imax];//меняю местами
        array[imax] = array[imin];
        array[imin] = temp;
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
