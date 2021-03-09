package ru.javabegin.training.fastjava2.arraysOfArrays;

import java.util.Scanner;
//Если ставить от 0 до 15, 5 почти никогда не выпадет 3 раза!!!
public class Task11 {
    public static void runner() {
        System.out.println("Введите размерность матрицы");
        Scanner in = new Scanner(System.in);
        int multiArr[][] = new int[10][20];
        int size2 = 15;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                multiArr[i][j] = (int) (Math.random() * ((size2 + size2) - size2));
            }
        }
        System.out.println("Дана матрица");
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < multiArr.length; i++) {
            sum = 0;
            for (int j = 0; j < multiArr[i].length; j++) {
                if (multiArr[i][j] == 5) {
                    sum += multiArr[i][j];
                }
            }
            if (sum > 14) {
                System.out.print("№: " + i + "\t");
            }
        }
    }
}
