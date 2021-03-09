package ru.javabegin.training.fastjava2.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class FirstTask {
    public void mainMethod() {
        System.out.println("Введите число К");
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int[] array = new int[]{5, 7, 8, 4, 6, 46, 1, 0, 2, 15};
        System.out.print("Из массива элементов: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("Кратный числу К будет: ");

        for (int j = 0; j < array.length; j++) {
            int result = array[j] % K;
            if (result == 0) {
                System.out.print(array[j]+ " ");
            }
        }
    }
}
