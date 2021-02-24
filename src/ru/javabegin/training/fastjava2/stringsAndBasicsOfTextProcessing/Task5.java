package ru.javabegin.training.fastjava2.stringsAndBasicsOfTextProcessing;
// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.
public class Task5 {
    public void removeSpace() {
        String after = " hello     there   ";
        after = after.trim().replaceAll(" +", " ");
        System.out.println(after);
    }
}
