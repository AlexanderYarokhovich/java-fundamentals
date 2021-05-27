package ru.javabegin.training.fastjava2.aggregationAndComposition.task1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private final String SPACE = " ";
    private List<Word> words = new ArrayList<>();

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public void addWord(Word word) {
        this.words.add(word);
    }

    public void addSpace() {
        this.words.add(new Word(SPACE));
    }

    public void removeLastWord() {
        words.remove(words.size() - 1);
    }

    @Override
    public String toString() {
        String temp = "";
        for (Word word : words) {
            temp += (word.getContent());
        }
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(SPACE, sentence.SPACE) &&
                Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SPACE, words);
    }
}
