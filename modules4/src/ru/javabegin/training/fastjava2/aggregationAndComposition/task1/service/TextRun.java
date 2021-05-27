package ru.javabegin.training.fastjava2.aggregationAndComposition.task1.service;

import ru.javabegin.training.fastjava2.aggregationAndComposition.task1.model.Sentence;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task1.model.Text;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task1.model.Word;

import java.util.Arrays;

public class TextRun {
    public static void main(String[] args) {

        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();
        Sentence sentence3 = new Sentence();
        Sentence sentence4 = new Sentence();
        sentence1.setWords(Arrays.asList(new Word("Мама "),new Word("мыла "),new Word("раму. ")));
        sentence2.setWords(Arrays.asList(new Word("Саша "),new Word("сосала "),new Word("сушку. ")));
        sentence3.setWords(Arrays.asList(new Word("Таня "),new Word("уронила "),new Word("мячик. ")));
        sentence4.setWords(Arrays.asList(new Word("Ехал "),new Word("Грека "),new Word("через реку. ")));
        Text text = new Text();
        text.setSentences(Arrays.asList(sentence1, sentence2, sentence3, sentence4));
        System.out.println(text.toString());
    }
}
