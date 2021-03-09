package ru.javabegin.training.fastjava2.decompositionUsingMethods;

import ru.javabegin.training.fastjava2.decompositionUsingMethods.utils.ArrUtils;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).
public class Task5 {
    ArrUtils utils = new ArrUtils();
    int[] arr = utils.generateMass();

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void bubbleSort() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    swap(arr, i, i - 1);
                    needIteration = true;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > arr[k + 1]) {
                System.out.println(arr[k + 1]);
                return;
            }
        }
    }
}
