package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;
//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Task1 {
    public void probel() {
        String str = "sijfnd  jarnfi rjfi   irofejrfjeorjojfj";
        int count = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (" ".equals(String.valueOf(str.charAt(i)))) {
                count++;
            } else if (count > max) {
                max = count;
                count = 0;
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
