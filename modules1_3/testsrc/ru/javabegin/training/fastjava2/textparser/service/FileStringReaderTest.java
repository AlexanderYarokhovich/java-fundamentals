package ru.javabegin.training.fastjava2.textparser.service;

import org.junit.jupiter.api.Test;

class FileStringReaderTest {
    private final static String PATH = "c:/temp/temp.txt";
    @Test
    void shouldReadStringFromFile() {
        System.out.println(FileStringReader.read(PATH));
    }
}