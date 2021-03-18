package ru.javabegin.training.fastjava2.workingWithAstringAsAstringOrStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class Task8 {
    private final String str1 = "Sasha is a cool programmer he just doesn't know about it";

    public void longWord() {
      List<String> words = getListWord(str1);
      String max = getLongWord(words);
        System.out.println(max);
    }

    private List<String> getListWord(String str1) {
        List<String> listWord = new ArrayList<>();
        listWord = Arrays.asList(str1.split(" "));
        return listWord;
    }

    private String getLongWord(List<String> listStr) {
        String maxWord = "";
        for (String word : listStr) {
            if (maxWord.length() < word.length()) {
                maxWord = word;
            }
        }
        return maxWord;
    }
}
