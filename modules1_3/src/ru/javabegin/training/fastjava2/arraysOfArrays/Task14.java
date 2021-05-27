package ru.javabegin.training.fastjava2.arraysOfArrays;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static int getRandomValue(int limit) {
        return (int) (Math.random() * limit);
    }

    public static int[] peremeshatmassiv(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = rnd.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
        return arr;
    }

    public static void runner() {
        int temp = 1;
        int stolbec;
        int rand;

        System.out.println("Введите размерность матрицы n:");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int multiArr[][] = new int[size][size];
        int size2 = size;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                multiArr[i][j] = temp;
            }

            size2--;
        }
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
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                rand = (int) (Math.random() * size - 1);
                int tmp = multiArr[j][i];
                multiArr[j][i] = multiArr[rand][i];
                multiArr[rand][i] = tmp;

            }
        }

        System.out.println("Дана матрица");
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr.length; j++) {
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

