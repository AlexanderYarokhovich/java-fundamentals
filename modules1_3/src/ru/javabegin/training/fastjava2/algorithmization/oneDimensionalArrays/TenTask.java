package ru.javabegin.training.fastjava2.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class TenTask {

    static int n;

    public static void runMethod() {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();// Заполняем массив числами
        }
        System.out.print("Из массива элементов: ");
        for (int element : a) {
            System.out.print(element + " ");
        }
        for (int i = 0; i < a.length; i++) {

                if (i % 2!=0){
                    a[i]=0;
                }
            }
        System.out.println();
        System.out.print("Выбрасываем каждый второй элемент ");
        for (int element : a) {
            System.out.print(element + " ");
        }
        }

}
