package ru.javabegin.training.fastjava2.sorting;

import java.util.Arrays;

//Реализуйте сортировку обменами.
public class Task2 {

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void bubbleSort(int[] c) {
        int counter = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < c.length; i++) {
                if (c[i] < c[i - 1]) {
                    swap(c, i, i - 1);
                    needIteration = true;
                }
                counter++;
            }
        }
        System.out.println("пузырек: " + counter);
        System.out.println(Arrays.toString(c));
    }
}

