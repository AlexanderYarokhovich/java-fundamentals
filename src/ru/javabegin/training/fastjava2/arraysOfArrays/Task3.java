package ru.javabegin.training.fastjava2.arraysOfArrays;

import java.util.Scanner;

public class Task3 {
    public static int stroka;
    public static int stolbec;

    public static void runner() {
        System.out.println("Введите размерность матрицы");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int multiArr[][] = new int[size][size];
        System.out.println("Введите приделы матрицы");
        int size2 = in.nextInt();
// int maxsize = Math.max(size2, size2 * (-1));
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
        System.out.println("Укажите какую хотите вывести строку и столбец?");
        stroka = in.nextInt();
        stolbec = in.nextInt();
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                if (i == stroka) {
                    System.out.print(multiArr[i][j] + "\t");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                if (j == stolbec) {
                    System.out.println(multiArr[i][j]);
                }
            }
        }
    }
}

