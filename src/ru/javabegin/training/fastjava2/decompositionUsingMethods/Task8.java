package ru.javabegin.training.fastjava2.decompositionUsingMethods;

import ru.javabegin.training.fastjava2.decompositionUsingMethods.utils.ArrUtils;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
public class Task8 {
    public void sumArr() {
        int[] arr=null;
        do {
             arr = ArrUtils.generateMass();
        }while (arr.length<4);
        System.out.println(arr.length);
    }
}
