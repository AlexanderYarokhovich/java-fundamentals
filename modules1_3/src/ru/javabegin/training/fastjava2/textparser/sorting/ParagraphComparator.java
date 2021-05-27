package ru.javabegin.training.fastjava2.textparser.sorting;

import ru.javabegin.training.fastjava2.textparser.model.Paragraph;

import java.util.Comparator;

public class ParagraphComparator implements Comparator<Paragraph> {
    @Override
    public int compare(Paragraph t1, Paragraph t2) {
        return t2.getSentences().size() - t1.getSentences().size();
    }
}
