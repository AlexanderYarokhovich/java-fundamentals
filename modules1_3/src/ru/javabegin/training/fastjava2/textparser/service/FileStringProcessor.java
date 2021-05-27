package ru.javabegin.training.fastjava2.textparser.service;

import ru.javabegin.training.fastjava2.textparser.model.Paragraph;
import ru.javabegin.training.fastjava2.textparser.model.Sentence;
import ru.javabegin.training.fastjava2.textparser.model.Word;
import ru.javabegin.training.fastjava2.textparser.sorting.ParagraphComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileStringProcessor {

    private static final String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})";
    private String text;

    public FileStringProcessor(final String path) {
        this.text = FileStringReader.read(path);
    }

    public void parseTextInToParagraph() {
        ParagraphComparator comp = new ParagraphComparator();
        List<Paragraph> paragraphList = new ArrayList<>();

        String[] paragraphs = text.split(PARAGRAPH_SPLIT_REGEX);

        List<String> text = Arrays.asList(paragraphs);

        for (String paragraph : text) {
            Paragraph par = stringToParagraph(paragraph.trim());
            paragraphList.add(par);
        }
        Collections.sort(paragraphList, comp);
        System.out.println(paragraphList.get(0));
    }



    private Paragraph stringToParagraph(String strPar) {
        Paragraph paragraph = new Paragraph();
        List<String> strWord = new ArrayList<>();
        List<Sentence> sentences = new ArrayList<>();
        List<String> strSentences = Arrays.asList(strPar.split("\\."));


        for (String strSent : strSentences) {
            Sentence sentence = new Sentence();
            List<Word> listWord = stringToWord(strSent);
            sentence.setWords(listWord);
            sentences.add(sentence);
        }
        paragraph.setSentences(sentences);
        return paragraph;
    }

    public List<Word> stringToWord(String srtSentence){
        String withoutSpace =  srtSentence.trim();
        List<Word> listWord = new ArrayList<>();
        for (String word : withoutSpace.split(" ")){
            Word wrObj = new Word(word);
            listWord.add(wrObj);
        }
        return listWord;
    }


}

