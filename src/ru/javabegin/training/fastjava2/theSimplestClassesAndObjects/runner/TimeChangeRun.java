package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.runner;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class TimeChangeRun {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println("выберете что вы хотите поменять? 1-часы, 2-минуты, 3-секунды");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==1){
            withHour(time, 24);
        }
        if(number==2){
            withMinutes(time, 60);
        }
        if(number==3){
            withSecond(time, 60);
        }
    }
    private static void withHour(LocalTime time, int topLimitHour) {
        System.out.println("Установите время в часах");
        Scanner sc = new Scanner(System.in);
        int numberHour = sc.nextInt();
        if (numberHour<=topLimitHour) {
            LocalTime timeHour = time.withHour(numberHour);
            System.out.println(timeHour);
        }
        else {
            LocalTime timeHour = time.withHour(00);
            System.out.println(timeHour);
        }
    }
    private static void withMinutes(LocalTime time, int topLimitMinutes) {
        System.out.println("Установите время в Минутах");
        Scanner sc = new Scanner(System.in);
        int numberMinute = sc.nextInt();
        if (numberMinute<=topLimitMinutes) {
            LocalTime timeMinute = time.withMinute(numberMinute);
            System.out.println(timeMinute);
        }
        else {
            LocalTime timeMinute = time.withMinute(00);
            System.out.println(timeMinute);
        }
    }
    private static void withSecond(LocalTime time, int topLimitSecond) {
        System.out.println("Установите время в секундах");
        Scanner sc = new Scanner(System.in);
        int numberSecond = sc.nextInt();
        if (numberSecond<=topLimitSecond) {
            LocalTime timeSecond = time.withSecond(numberSecond);
            System.out.println(timeSecond);
        }
        else {
            LocalTime timeSecond = time.withSecond(00);
            System.out.println(timeSecond);
        }
    }
}
