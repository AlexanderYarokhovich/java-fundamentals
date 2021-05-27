package ru.javabegin.training.fastjava2.decompositionUsingMethods;

import ru.javabegin.training.fastjava2.decompositionUsingMethods.utils.ArrUtils;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
public class Task11 {
    private final int numOne = ArrUtils.generateInt(10);
    private final int numTwo = ArrUtils.generateInt(10000);

    public void digitNumbers() {
        final int numOneLength = getSum(numOne);
        final int numTwoLength = getSum(numTwo);
        if (numOneLength == numTwoLength) {
            System.out.println("Количество чисел одинаковое");
        } else {
            System.out.println(numOneLength > numTwoLength ? "В первом числе больше цифр."
                    : "В втором числе больше цифр.");
        }
    }
    public static int getSum(final int gen) {
        return String.valueOf(gen).toCharArray().length;
    }
}

