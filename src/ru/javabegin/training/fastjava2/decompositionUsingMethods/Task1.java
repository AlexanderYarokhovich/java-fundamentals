package ru.javabegin.training.fastjava2.decompositionUsingMethods;

import ru.javabegin.training.fastjava2.decompositionUsingMethods.utils.ArrUtils;

/*1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:*/
public class  Task1 extends ArrUtils {
        public static int gcd(int a,int b) {
            while (b !=0) {
                int tmp = a%b;
                a = b;
                b = tmp;
            }
            return Math.abs(a);
        }
    public static int lcm(int a,int b){
        return a  * b/ gcd(a, b);
    }
    public void nodNok(){
        int a = generateInt(1000);
        int b = generateInt(500);
        System.out.println("Генерирую 2 случайных числа");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        int c = gcd(a, b);
        System.out.println("NOD: " + c);
        int d = lcm(a, b);
        System.out.println("NOK: " + d);
    }
}
