package ru.javabegin.training.fastjava2.decompositionUsingMethods;
// Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
public class Task10 {
    public void constructorArr(int naturalNumber) {
        int[] arr = new int[naturalNumber+1];
        for (int i = 0; i < naturalNumber + 1; i++) {
            arr[i] = i;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
