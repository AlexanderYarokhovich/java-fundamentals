package ru.javabegin.training.fastjava2.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class NineTask {

    static int n, num, c, numB, max, numMax, el, min;

    public static void runMethod() {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] d = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();// Заполняем массив числами
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) num++; // Находим сколько раз каждое число находится в массиве
            }
            b[i] = num;
            num = 0; // Заполняем массив b этими значениями
        }

        for (int i = 0; i < b.length; i++) {

            if (b[i] == 1) numB++; // Если весь массив равен единице, то все элементы различны
        }

        if (numB == b.length) System.out.println("Повторяющиеся элементы отсутствуют");

        else {
            max = b[0];
            for (int i = 0; i < b.length; i++) {
                if (max < b[i]) {
                    max = b[i];
                    c = i;
                } // Находим максимальное количество повторяющихся элементов
            }
            for (int i = 0; i < b.length; i++) {
                if (max == b[i]) {
                    numMax++;
                }// Находим количество максимально повторяющихся элементов
            }
            if (numMax == 1) { // Если их количество равно 1 ,то одно число повторяется максимальное количество раз
                System.out.println("Число " + a[c] + " встречается " + max + " раза"); // Выводим это число
            } else {
                for (int i = 0; i < b.length; i++) {
                    if (b[i] == max) {
                        d[i] = a[i];
                    }// Если же таких элементов несколько ,то заполняем новый массив D этими элементами
                }
                min = 0;
                c = 0;
                for (int i = 0; i < d.length; i++) {
                    if (d[i] == 0) {
                    } else {                              // Находим в массиве D минимальное число
                        if (min == 0) {
                            min = d[i];
                        } else if (min > d[i]) {
                            min = d[i];
                        }
                    }
                }
                System.out.println("Число " + min + " встречается " + max + " раза"); // Выводим минимальное число в массиве ,которое встречается максимальное количество раз

            }
        }
    }
}
