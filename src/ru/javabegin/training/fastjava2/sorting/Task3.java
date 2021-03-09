package ru.javabegin.training.fastjava2.sorting;

import java.util.Arrays;

public class Task3 {
    public void sortVstavkami(int[] c){
        int counter = 0;
        for (int left = 0; left < c.length; left++) {
// Вытаскиваем значение элемента
            int value = c[left];
// Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < c[i]) {// Если вытащили значение меньшее — передвигаем больший элемент дальше
                    c[i + 1] = c[i];
                } else {
                    break;// Если вытащенный элемент больше — останавливаемся
                }
                counter++;
            }
            c[i + 1] = value;// В освободившееся место вставляем вытащенное значение
        }
        System.out.println("Вставки: " + counter);
        System.out.println(Arrays.toString(c));
    }
}

