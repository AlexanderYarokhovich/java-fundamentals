package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;
//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task5 {
    public void countСharacters(){
        String str = new String("Sanya will soon become a cool programmer!");
        int counter =0;
        for (int i = 0; i < str.length(); i++) {
            if ("a".equals(String.valueOf(str.charAt(i)))) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
