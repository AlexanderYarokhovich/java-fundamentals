package ru.javabegin.training.fastjava2.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class SixTask {
    static int var = 2;
    static double sum = 0.0;

    public static void runMethod() {
        double[] array = new double[]{15.0, 4.0, 97.0, 7.0, 21.0, 13};
        System.out.print("Из массива элементов: ");
        for (double element : array) {
            System.out.print(element + " ");
        }
       System.out.println();
        for (int i = 0; i < array.length; i++) {
            var = 2;
            checkIsItANaturalNumber(i, array[i]);
        }
        System.out.println("sum " + sum );
    }

    private static void checkIsItANaturalNumber(int i, double elem) {

        if (i > 1) {
            if (i % var != 0) {
                var++;
                checkIsItANaturalNumber(i, elem)
                ;
            } else if (i % var == 0) {
                printIsItNaturalNumber(var, i, elem);
            }
        }
    }

    private static void printIsItNaturalNumber(int var, int i, double e) {
        if (i == var) {
            System.out.println(i + " is a natural number.");
            sum = sum + e;
        }
    }
}