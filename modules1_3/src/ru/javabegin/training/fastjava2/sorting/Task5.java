package ru.javabegin.training.fastjava2.sorting;

import java.util.Arrays;

public class Task5 {
    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    public void sortShella(int[] arr){
        int counter = 0;
        int gap = arr.length / 2;
// Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < arr.length; right++) {
// Смещаем правый указатель, пока не сможем найти такой, что
// между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (arr[c] > arr[c + gap]) {
                        swap(arr, c, c + gap);
                    }
                    counter++;
                }
            }
// Пересчитываем разрыв
            gap = gap / 2;
        }
        System.out.println("Шелла: " + counter);
        System.out.println(Arrays.toString(arr));
    }
}

