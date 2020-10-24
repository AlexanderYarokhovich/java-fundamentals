package ru.javabegin.training.fastjava2.сycles;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.math.*;

import static java.lang.StrictMath.*;

public class Cycles {
    public static void main(String[] args) {
//        Sum.summa();
//        SumaKvadratov.summa();
//        ProizvedenieKvadratov.summa();
//        Sootvetstvya.vuvod();
//        Delitel.vuvod();
//        Dlinna.dlinnaChisla();
        Function.functionY();
    }
}

class Sum {
    public void summa() {
        System.out.println("До какого числа суммировать?");
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

class SumaKvadratov {
    public static void summa() {
        System.out.println("До какого числа суммировать квадраты?");
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += pow(i, 2);
        }
        System.out.println(sum);

    }
}

class ProizvedenieKvadratov {
    public static void summa() {
        System.out.println("До какого числа суммировать квадраты?");
        Scanner vvod = new Scanner(System.in);

        int n = vvod.nextInt();

        BigInteger result = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= n; i++) {
            BigInteger val = new BigInteger(String.valueOf(i));
            val = val.pow(2);
            result = result.multiply(val);
        }
        System.out.println(result);// В результате вконце почемуто много нулей если выбрать 200
    }                              // может где-то накосячил?

}

class Sootvetstvya {
    public static void vuvod() {
        System.out.println("char pls?");
        Scanner vvod = new Scanner(System.in);

        String n = vvod.nextLine();
        Character val = n.charAt(0);
        System.out.println((int) val);//просили не юни код а численное обозначение. мне кажется оно.
    }
}

class Delitel {
    public static void vuvod() {
        System.out.println("Vvedi pervoe chislo m?");
        Scanner vvod = new Scanner(System.in);
        int m = proverka(vvod);
        System.out.println("Vvedi vtoroe chislo n?");
        int n = proverka(vvod);
        for (int chislo = m; chislo <= n; chislo++) {
            System.out.print("Делителями числа " + chislo + " являются: ");
            for (int delitel = 2; delitel < chislo; delitel++) {
                int resultDeleniy = chislo % delitel;
                if (resultDeleniy == 0) {
                    System.out.print(delitel + " ");
                }

            }
            System.out.println();
        }
    }

    private static int proverka(Scanner vvod) {
        int a = 0;
        if (vvod.hasNextInt()) {
            a = vvod.nextInt(); //Если проверка пройдена, перемменой а присваивается значение введенного числа
            return a;
        }
        throw new RuntimeException("не верное число");
    }
}

class Dlinna {
    public static void dlinnaChisla() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        System.out.println("Цифры которые входят в число a: " + numberEnter(a));
        System.out.println("Цифры которые входят в число b: " + numberEnter(b));
    }

    public static int[] numberEnter(int a) {

        String valString = String.valueOf(a);
        int chislo = valString.length();
        int[] arr = new int[chislo];
        int i = 0;
        while (a > 0) {
            arr[i] = a % 10;
            a = a / 10;
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" " + arr[j]);
        }
        return arr;
    }

}

class Function {
    public static void functionY() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        System.out.println("Введите h: ");
        int h = in.nextInt();
        if (a > 2) {
            System.out.print("Результат функции у= ");
            for (int chislo = a; chislo <= b; chislo += h) {
                System.out.print(" " + chislo + " ");
            }
        } else {
            System.out.print("Результат функции у= ");
            for (int chislo = a; chislo <= b; chislo += h) {
                int chislo1 = ~chislo;
                System.out.print(" " + chislo1 + " ");
            }
        }


    }
}