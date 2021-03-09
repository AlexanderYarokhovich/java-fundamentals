package ru.javabegin.training.fastjava2.arraysOfArrays;

import java.util.Scanner;

public class Task15 {
    public static int getMaxValue(int[][] multiArr) {
        int max = 0;
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                if (multiArr[i][j] > max) {
                    max = multiArr[i][j];
                }
            }
        }
        return max;
    }
    int max;
    public static void runner() {
        int max = 0;
        System.out.println("Введите размерность матрицы");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int multiArr[][] = new int[size][size];
        System.out.println("Введите приделы матрицы");
        int size2 = in.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiArr[i][j] = (int) (Math.random() * size2);
            }
        }
        System.out.println("Дана матрица");
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        max = getMaxValue(multiArr);
        System.out.println("max: " + max);
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                if (multiArr[i][j] % 2 == 0) {
                    multiArr[i][j] = max;
                }
            }
        }
        System.out.println("Новая матрица");
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}




