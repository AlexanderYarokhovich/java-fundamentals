package ru.javabegin.training.fastjava2.javafundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class OptionTask {
    public static void optiontask1() {
        System.out.println("Сколько будет элементов в массиве?");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Введите " + (index + 1) + "-й элемент массива: ");
            array[index] = in.nextInt();
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }

        int min = array[0];
        for (int n = 0; n < array.length; n++) {
            if (array[n] < min) {
                min = array[n];
            }
        }
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }

    public static void optiontask2() {
        System.out.println("Введите числа через пробел");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longWord = "", shortWord = line;
        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) {
                longWord = s;
            }
            if (s.length() < shortWord.length()) {
                shortWord = s;
            }
        }
        System.out.println("Самое длинное слово: '" + longWord + "'");
        System.out.println("Длина: " + longWord.length());
        System.out.println("Самое короткое слово: '" + shortWord + "'");
        System.out.println("Длина: " + shortWord.length());
    }

    public static void optiontask3() {
        System.out.println("Введите размер массива потом числа через Enter");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String[] arr = new String[size];
        //Вводим значения в массив (вместо массива лучше использовать конечно же
//динамическую структуру данных (например ArrayList):
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextLine();
        }
//Здесь происходит сортировка (сортировка пузырьком):
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами */
                if (arr[j].length() > arr[j + 1].length()) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
//выводим результат на экран:
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void optiontask4() {
        System.out.println("Введите размерность матрицы");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int chessBoard[][] = new int[size][size];
        System.out.println("Введите приделы матрицы");
        int size2 = in.nextInt();
        int maxsize = Math.max(size2, size2 * (-1));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                chessBoard[i][j] = (int) (Math.random() * (maxsize - maxsize * (-1)) + maxsize * (-1));
            }
        }

        System.out.println(Arrays.deepToString(chessBoard));
    }
}




