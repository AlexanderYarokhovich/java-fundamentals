package ru.javabegin.training.fastjava2.aggregationAndComposition.task1.model;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences = new ArrayList<>();

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public void addSentence(Sentence sentence){
        this.sentences.add(sentence);
    }

    @Override
    public String toString() {
        String temp = "";
        for (Sentence tex : sentences) {
            temp += (tex);
        }
        return temp;
    }
}
