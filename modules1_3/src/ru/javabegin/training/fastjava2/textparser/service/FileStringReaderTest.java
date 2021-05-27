package ru.javabegin.training.fastjava2.textparser.service;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileStringReaderTest {
    private final static String PATH = "c:/temp/temp.txt";
    @Test
    void shouldReadStringFromFile() {
        System.out.println(FileStringReader.read(PATH));
    }
}