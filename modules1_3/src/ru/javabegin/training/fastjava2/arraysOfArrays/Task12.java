package ru.javabegin.training.fastjava2.arraysOfArrays;

import java.util.Scanner;

public class Task12 {
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
//сортирую по возрастанию
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                int min = multiArr[i][j];
                int min_j = j;
                for (int k = j + 1; k < multiArr.length; k++) {

                    if (multiArr[i][k] < min) {
                        min = multiArr[i][k];
                        min_j = k;
                    }
                }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
                if (j != min_j) {
                    int tmp = multiArr[i][j];
                    multiArr[i][j] = multiArr[i][min_j];
                    multiArr[i][min_j] = tmp;
                }
            }
        }
        System.out.println("Сортировка по возрастанию");
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }
        //сортирую по убыванию
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                int max = multiArr[i][j];
                int max_j = j;
                for (int k = j + 1; k < multiArr.length; k++) {

                    if (multiArr[i][k] > max) {
                        max = multiArr[i][k];
                        max_j = k;
                    }
                }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
                if (j != max_j) {
                    int tmp = multiArr[i][j];
                    multiArr[i][j] = multiArr[i][max_j];
                    multiArr[i][max_j] = tmp;
                }
            }
        }
        System.out.println("Сортировка по убыванию");
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

