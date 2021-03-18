package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;
// Из заданной строки получить новую, повторив каждый символ дважды.
public class Task6 {
    public void newString(){
        String str1 = "Sanya will soon become a cool programmer!";
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            str2.append(c);
            str2.append(c);
        }
        System.out.println(str2);
    }
}
