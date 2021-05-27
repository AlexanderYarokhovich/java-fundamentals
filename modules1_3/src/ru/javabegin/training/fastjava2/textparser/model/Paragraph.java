package ru.javabegin.training.fastjava2.textparser.model;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
//    private String content;
    private List<Sentence> sentences = new ArrayList<>();

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "sentences=" + sentences +
                '}';
    }
}
