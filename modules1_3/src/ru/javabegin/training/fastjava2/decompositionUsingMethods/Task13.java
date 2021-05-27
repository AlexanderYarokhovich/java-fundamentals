package ru.javabegin.training.fastjava2.decompositionUsingMethods;

//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти и напечатать
// все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
public class Task13 {
    public void printTwins() {
        int[] array = getPrimeNumber(10, 100);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] == 2) {
                System.out.println("twins " + array[i] + " " + array[i + 1]);
            }
        }
    }

    private int[] getPrimeNumber(int n, int n2) {
        int[] arr = new int[n2 - n];
        boolean b = true;
        int j = 0;
        for (; n <= n2; n++) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                arr[j] = n;
                j++;
            } else {
                b = true;
            }
        }
        int[] arrGotov = new int[arr.length];
        for (int i = 0; i < j; i++) {
            arrGotov[i] = arr[i];
        }
        return arrGotov;
    }
}
