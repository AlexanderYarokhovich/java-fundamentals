package ru.javabegin.training.fastjava2.branching;

import java.util.Scanner;

import static java.lang.StrictMath.*;

public class Branching {

    public static void main(String[] args) {
//        Triangle.structuraTreangles();
//        MaxMin.bolshiyizmenshih();
//        Stroyka.kirpich();
//        Function.raschet();
        TochkiNaPriamou.tochki();
    }
}

class Triangle {
    public static void structuraTreangles() {
        System.out.println("Введите градусы угла x");
        Scanner vvod = new Scanner(System.in);
        int x = vvod.nextInt();
        System.out.println("Введите градусы угла y");
        double y = vvod.nextInt();
        if (y + x >= 180) {
            System.out.println("Такого треугольника не существует!");
        } else if (y == 90 || x == 90 || x + y == 90) {
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треугольник не прямоугольный");
        }
    }
}

class MaxMin {
    public static void bolshiyizmenshih() {
        System.out.println("Введите число а");
        Scanner vvod = new Scanner(System.in);
        double a = vvod.nextInt();
        System.out.println("Введите число b");
        double b = vvod.nextInt();
        System.out.println("Введите число c");
        double c = vvod.nextInt();
        System.out.println("Введите число d");
        double d = vvod.nextInt();
        System.out.println("Большее число из 2 чисел: " + max(min(a, b), min(c, d)));
    }
}

class Stroyka {
    public static void kirpich() {
        System.out.println("Введите число A");
        Scanner vvod = new Scanner(System.in);
        double A = vvod.nextDouble();
        System.out.println("Введите число B");
        double B = vvod.nextDouble();
        System.out.println("Введите число x");
        double x = vvod.nextDouble();
        System.out.println("Введите число y");
        double y = vvod.nextDouble();
        System.out.println("Введите число z");
        double z = vvod.nextDouble();
        if (A > x && B > y || A > x && B > z || A > y && B > z) {
            System.out.println("Kirpich prolezet!!");
        } else {
            System.out.println("Kirpich HE prolezet!");
        }


    }
}

class Function {
    public static void raschet() {
        System.out.println("Введите число x");
        Scanner vvod = new Scanner(System.in);
        double x = vvod.nextDouble();
        if (x <= 3) {
            double F;
            F = pow(x, 2) - 3 * x + 9;
            System.out.println("F= " + F);
        } else {
            double F;
            F = 1 / (pow(x, 3) + 6);
            System.out.println("F= " + F);
        }


    }
}

class TochkiNaPriamou {
    public static void tochki() {
        System.out.println("Введите координату х1 для A");
        Scanner vvod = new Scanner(System.in);
        double x1 = vvod.nextDouble();
        System.out.println("Введите координату у1 для A");
        double y1 = vvod.nextDouble();
        System.out.println("Введите координату х2 для В");
        double x2 = vvod.nextDouble();
        System.out.println("Введите координату у2 для В");
        double y2 = vvod.nextDouble();
        System.out.println("Введите координату х3 для С");
        double x3 = vvod.nextDouble();
        System.out.println("Введите координату у3 для С");
        double y3 = vvod.nextDouble();
        double z = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));//эту формулу где-то скапировал
        if (z == 0) {
            System.out.println("Точки на одной прямой!!");
        } else {
            System.out.println("Точки не на одной прямой");
        }


    }
}