package ru.javabegin.training.fastjava2.sorting;

import java.util.Arrays;

public class Task4 {
    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    public void sortVuborom(int[] c){
        int counter = 0;
        for (int left = 0; left < c.length; left++) {
            int minInd = left;
            for (int i = left; i < c.length; i++) {
                if (c[i] < c[minInd]) {
                    minInd = i;
                }
                counter++;
            }
            swap(c, left, minInd);
        }
        System.out.println("Выбор: " + counter);
        System.out.println(Arrays.toString(c));
    }
}

