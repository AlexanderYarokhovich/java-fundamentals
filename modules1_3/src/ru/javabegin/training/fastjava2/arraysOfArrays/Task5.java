package ru.javabegin.training.fastjava2.arraysOfArrays;

import java.util.Scanner;

public class Task5 {
    public static int temp = 1;
    public static int stolbec;

    public static void runner() {
        System.out.println("Введите размерность матрицы n:");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int multiArr[][] = new int[size][size];
        int size2 = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
// if (j < size) {
                multiArr[i][j] = temp;
// }
            }
            temp++;
            size2--;
        }
        System.out.println("Дана матрица");
        for(int i = 0;i<multiArr.length;i++){
            for (int j = 0; j < multiArr.length; j++) {
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
