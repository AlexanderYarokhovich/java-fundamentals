package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".
public class Task7 {
    String string = "abc cde def";

    public void removeRepetitions() {
        string = string.replaceAll(" ", "");
        char[] chars = string.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
    }
}