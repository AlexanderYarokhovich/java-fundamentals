package ru.javabegin.training.fastjava2.aggregationAndComposition.task1.model;

public class Word {
    private String content;

    public Word(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Word{" +
                "content='" + content + '\'' +
                '}';
    }
}
