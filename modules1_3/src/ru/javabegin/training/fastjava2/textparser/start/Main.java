package ru.javabegin.training.fastjava2.textparser.start;

import ru.javabegin.training.fastjava2.textparser.model.Word;
import ru.javabegin.training.fastjava2.textparser.service.FileStringProcessor;
import ru.javabegin.training.fastjava2.textparser.service.FileStringReader;

import java.util.Collection;
import java.util.Collections;

public class Main {
    private final static String PATH = "c:/temp/temp.txt";
    private static FileStringProcessor processor = new FileStringProcessor(PATH);

    public static void main(String[] args) {
        processor.parseTextInToParagraph();
        System.out.println("finish");
    }
}
