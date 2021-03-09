package ru.javabegin.training.fastjava2.sorting;
import java.util.Scanner;

public class Task1{
    private int[] concat(int[] a, int[] b, int k) {
        int aLen = a.length;
        int bLen = b.length;
        int[] c = new int[aLen + bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        int counter = 0;
        int temp = 0;
        for (int i = 0; i < c.length; i++) {
            if (i < k) {
                c[i] = a[i];
            }
            if (i == k) {
                temp = i;
            }
            if (i >= k && i < k + b.length) {
                c[i] = b[counter];
                counter++;
            }
            if (i >= k + b.length) {
                c[i] = a[temp];
                temp++;
            }


        }

        return c;
    }

    public void runner() {
        System.out.println("Введите размерность первого и второго массива");
        Scanner in = new Scanner(System.in);
        int size1 = in.nextInt();
        int size2 = in.nextInt();
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        System.out.println("Ввидите придел значений рандома");
        int size3 = in.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (size3 + 1));
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * (size3 + 1));
        }
        System.out.println("Даны массивы");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        System.out.println("Ввидите число k для объединения массивов");
        int k = in.nextInt();
        int[] c = concat(arr1, arr2, k);
        for (int i : c) {
            System.out.print(i + " ");
        }
    }
}