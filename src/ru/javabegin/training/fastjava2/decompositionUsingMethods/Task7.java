package ru.javabegin.training.fastjava2.decompositionUsingMethods;
//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Task7 {

     public int factNaive(int n)
    {
        int r = 1;
        for (int i = 2; i <= n; ++i)
            r *= i;
        return r;
    }
}
