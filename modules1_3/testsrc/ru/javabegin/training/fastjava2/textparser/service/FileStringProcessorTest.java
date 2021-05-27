package ru.javabegin.training.fastjava2.textparser.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileStringProcessorTest {
    private final static String PATH = "c:/temp/temp.txt";
    private FileStringProcessor processor = new FileStringProcessor(PATH);
    @Test
    public void shouldSplitTextIntoParagraphs(){
        processor.parseTextInToParagraph();
    }

}