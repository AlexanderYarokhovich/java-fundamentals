package ru.javabegin.training.fastjava2.decompositionUsingMethods;
/*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.*/
public class Task2 {
        public void nod4(){
            int a = (int) (Math.random() * (500 + 1));
            int b = (int) (Math.random() * (500 + 1));
            int c = (int) (Math.random() * (500 + 1));
            int d = (int) (Math.random() * (500 + 1));
           /*int a = 78; //для проверки, так как рандом почти всегда 1
           int b = 294;
           int c = 570;
           int d = 36;*/
            System.out.println("Генерирую 4 случайных числа");
            System.out.println("A: " + a);
            System.out.println("B: " + b);
            System.out.println("C: " + c);
            System.out.println("D: " + d);
            int k = gcd(a, b);
            int k2 = gcd(k, c);
            int k3 = gcd(k2, d);
            System.out.println("NOD: " + k3);
    }
    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return Math.abs(a);
    }
}
