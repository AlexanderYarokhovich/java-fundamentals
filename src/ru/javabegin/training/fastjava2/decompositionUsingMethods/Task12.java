package ru.javabegin.training.fastjava2.decompositionUsingMethods;
//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
// сумма цифр которых равна К и которые не большее N.

import ru.javabegin.training.fastjava2.decompositionUsingMethods.utils.ArrUtils;

import java.util.ArrayList;
import java.util.List;


public class Task12 {
    int k = 5;

    int[] arr = new int[20];
    int difference = 0;
    int n = 20;

    public void formMass() {
        List<Integer> collection = new ArrayList<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = getNumberWithConditions(k, n);
            collection.add(getNumberWithConditions(k,n));
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private int getNumberWithConditions(final int k, final int n) {
        int gen = 0;
        int sum = 0;
        do {
            gen = ArrUtils.generateInt(20);
            sum = getSum(gen);
            System.out.println("GENERATED value " + gen + " sum= " + sum);
            System.out.println(sum !=k);
            System.out.println(gen>n);
        } while (!(sum == k && gen<n));

        return gen;
    }

    public int getSum(final int gen) {
        int sum = 0;
        char[] chars = String.valueOf(gen).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println("chars[i]" + chars[i]);
            sum += Integer.parseInt(String.valueOf(chars[i]));
        }
        return sum;
    }
}

