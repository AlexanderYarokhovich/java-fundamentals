package ru.javabegin.training.fastjava2.decompositionUsingMethods.utils;
//генерир случ число

public class ArrUtils {
    public static int generateInt(int limit) {
        int randomInt = (int) (Math.random() * (limit + 1));
        System.out.print("Число: " + randomInt);
        System.out.println();
        return randomInt;
    }
    public static int[] generateMass(){
        int size1 = (int) (Math.random() * (15 + 1));
        int[] arr = new int[size1];
        System.out.println("Массив из случайных чисел");
        int size3 = 15;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (size3 + 1));
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        return arr;
    }


}

