package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;
//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Task4 {
    public void copyStr() {
        String str1 = new String("информатика");
        char[] str2 = new char[4];
        str1.getChars(7, 8, str2, 0);
        str1.getChars(3, 4, str2, 1);
        str1.getChars(4, 5, str2, 2);
        str1.getChars(7, 8, str2, 3);
        System.out.println(str2);
    }
}
