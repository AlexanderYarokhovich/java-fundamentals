package ru.javabegin.training.fastjava2.textparser.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileStringReader {
    public static String read(final String path) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}

