package ru.javabegin.training.fastjava2.decompositionUsingMethods;
//. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n,
// равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
public class Task14 {
    public void ArmstrongRange(int arm) {
        for (int num = 1; num < arm; num++) {
            int number, digit, sum = 0;
            number = num;
            while (number != 0) {
                digit = number % 10;
                sum = sum + digit * digit * digit;
                number /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is an Armstrong number");
            }
        }
    }


}
