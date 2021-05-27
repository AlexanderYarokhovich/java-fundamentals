package ru.javabegin.training.fastjava2.javafundamentals;

import java.util.Random;
import java.util.Scanner;

public class Fundamentals {


    public static void main(String[] args) {


//        task1();
//        task2();
        task3();
//        task4();
//        task5();
//        OptionTask.optiontask1();
//        OptionTask.optiontask2();
//        OptionTask.optiontask3();
//        OptionTask.optiontask4();
    }

    public static void task1() {
        System.out.println("Hello, what is your name?");
        Scanner name = new Scanner(System.in);
        System.out.println("Hello " + name.nextLine());
    }

    public static void task2() {
        System.out.println("Slovo kotoroe hotite perevernyt");
        Scanner vvod = new Scanner(System.in);
        StringBuffer text = new StringBuffer(vvod.nextLine());
        text.reverse();
        System.out.println("conversely: " + text.toString());

    }

    public static void task3() {
        System.out.println("Skolko generirovat  chisel ot 1 do 100?");
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(getValue());
        }
    }

    private static int getValue() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void task4() {
        System.out.println("Vvedite 2 chisla");
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = vvod.nextInt();
        int sum = a + b;
        int composition = a * b;
        System.out.println("Sum: " + sum);
        System.out.println("composition: " + composition);
    }

    public static void task5() {
        System.out.println("Vvedite chislo ot 1 do 12");
        Scanner vvod = new Scanner(System.in);
        int month = vvod.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("I don't know that!");
                break;
        }
    }
}

