package ru.javabegin.training.fastjava2.stringsAndBasicsOfTextProcessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//В строке найти количество чисел.
public class Task4 {
    public void countNums() {
        String my_string = "кофе 300;чай 500;какао 350;кофе 456";
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(my_string);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println("Количество чисел: " + count);
    }
}

