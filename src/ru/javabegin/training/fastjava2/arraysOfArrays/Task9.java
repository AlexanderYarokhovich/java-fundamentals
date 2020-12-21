package ru.javabegin.training.fastjava2.arraysOfArrays;

import java.util.Scanner;

public class Task9 {
    public static void runner() {
        System.out.println("Введите размерность матрицы");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int multiArr[][] = new int[size][size];
        System.out.println("Введите приделы матрицы");
        int size2 = in.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiArr[i][j] = (int) (Math.random() * ((size2 + size2) - size2));
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
        int s = 0;
        int max = 0;
        for (int i = 0; i < multiArr[0].length; i++) {
            s = 0;
            for (int j = 0; j < multiArr.length; j++) {
                s = s + multiArr[j][i];
            }
            if (max < s) {
                max = s;
            }
            System.out.print(s + "\t");
        }
        System.out.println("max: " + max);
    }
}
