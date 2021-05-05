package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BookRun {
    public static void main(String[] args) {


    List<Book> books = new ArrayList<>();
        books.add(new Book(91, "Bible", "God", "RusBibleSociety", 2020, 1150, 1, "HardСover"));
        books.add(new Book(62, "Kook", "Bob", "MinskSociety", 2019, 115, 20, "leatherBinding"));
        books.add(new Book(77, "google", "Igar", "BrestSociety", 2021, 250, 50, "softCover"));
        books.add(new Book(12, "yandex", "Bob", "KievSociety", 2020, 470, 35, "softCover"));
        books.add(new Book(34, "Yahoo", "Bob", "LvivSociety", 2017, 300, 41, "leatherBinding"));
        books.add(new Book(56, "Java", "Jak", "MinskSociety", 2018, 784, 100, "HardСover"));
        authorBook(books);
        year(books);
        publishingHous(books);
    }

    private static void authorBook(List<Book> books){
        for (Book autr: books) {
            if(autr.getAuthor().equals("Bob")){
                System.out.println(autr.getName().toString());
            }
        }
    }
    private static void year(List<Book> books){
        for (Book autr: books) {
            if(autr.getYearOfPublish() > 2019){
                System.out.println("Книги выпущеные после 2019г " + autr.getName() + " " + autr.getYearOfPublish());
            }
        }
    }
    private static void publishingHous(List<Book> books){
        for (Book autr: books) {
            if(autr.getPublishingHouse().equals("MinskSociety")){
                System.out.println("Книги изданные MinskSociety: " + autr.getName());
            }
        }
    }
}
