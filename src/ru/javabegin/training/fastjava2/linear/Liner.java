package ru.javabegin.training.fastjava2.linear;

import java.util.Scanner;
import java.time.*;

import static java.lang.StrictMath.*;
// тут есть сложные формулы, их не могу отправить в идею, нужно смотреть задания линеар.

public class Liner {
    public static void main(String[] args) {
//        task1();
        task2();
//        task3();
//        task4();
//        task5();
//        task6();
    }
// Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static void task1() {
        System.out.println("Vvedite peremennyu a");
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        System.out.println("Vvedite peremennyu b");
        int b = vvod.nextInt();
        System.out.println("Vvedite peremennyu c");
        int c = vvod.nextInt();
        int z = ((a - 3) * b / 2) + c;
        System.out.println("Hello, z= " + z);
    }
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void task2() {
        System.out.println("Vvedite peremennyu a");
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        System.out.println("Vvedite peremennyu b");
        int b = vvod.nextInt();
        System.out.println("Vvedite peremennyu c");
        int c = vvod.nextInt();
        int z = (int) (((b + sqrt((int) pow(b, 2) + 4 * a * c)) / 2 * a) - pow(a, 3) * c + pow(b, -2));
        System.out.println("Hello, z= " + z);
    }
    //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void task3() {
        System.out.println("Введите градусы угла x");
        Scanner vvod = new Scanner(System.in);
        double x1 = vvod.nextInt();
        System.out.println("Введите градусы угла y");
        double y1 = vvod.nextInt();
        double x = toRadians(x1);
        double y = toRadians(y1);
        double z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        System.out.println("Hello, z= " + z);
    }
//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и
// целую части числа и вывести полученное значение числа.
    public static void task4() {
        System.out.println("Введите число R в формате nnn.ddd");
        Scanner vvod = new Scanner(System.in);// nnn = int(nnn_ddd);
        double x = vvod.nextDouble();         // ddd = (nnn_ddd - nnn) * 1000;
        double cel = (int) x;                 // ddd_nnn = ddd + nnn/1000.0;
        double result = cel / 1000;
        double drob = (x - cel) * 1000;
        drob = (int) drob;
        result += drob;
        System.out.println("число наобарот = " + result);
    }
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//
//ННч ММмин SSc.
    private static void task5() {
        System.out.println("Введите время в секундах");
        Scanner vvod = new Scanner(System.in);
        long secs = vvod.nextLong();
        long hour = secs / 3600;
        long min = secs / 60 % 60;
        long sec = secs % 60;
        System.out.println(String.format("%02d:%02d:%02d", hour, min, sec));

    }
//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
    private static void task6() {
        System.out.println("Введите координату х");
        Scanner vvod = new Scanner(System.in);
        int x = vvod.nextInt();
        System.out.println("Введите координату у");
        int y = vvod.nextInt();
        if (-3 < x & x < 3 & 0 <= y & y < 5) {
            boolean xy = true;
            System.out.println("xy = " + xy );
        } else if (-5 < x & x < 5 & 0 >= y & y > -5) {
            boolean xy = true;
            System.out.println("xy = " + xy );
        }
        else {
            boolean xy= false;
            System.out.println("xy = " + xy );
        }

    }
}



