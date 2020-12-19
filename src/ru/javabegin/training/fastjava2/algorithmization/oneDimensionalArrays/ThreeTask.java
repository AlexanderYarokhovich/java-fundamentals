package ru.javabegin.training.fastjava2.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class ThreeTask {
    public void mainMethod() {
        System.out.println("Введите число размер массива");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()*(200+1)) - 100;
        }
        System.out.print("Из массива элементов: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        int minus = 0;
        int plus = 0;
        int nol = 0;
        for (int j = 0; j < size; j++) {
            if (array[j] < 0) {
                minus++;
            } else if (array[j] > 0) {
                plus++;
            } else {
                nol++;
            }
        }
        System.out.println();
        System.out.println("minus " + minus);
        System.out.println("plus  " + plus);
        System.out.println("nol   " + nol);
    }
}


