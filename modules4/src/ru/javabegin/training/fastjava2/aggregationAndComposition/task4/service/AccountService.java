package ru.javabegin.training.fastjava2.aggregationAndComposition.task4.service;

import ru.javabegin.training.fastjava2.aggregationAndComposition.task4.model.Account;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task4.model.Client;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class AccountService {
    public static void main(String[] args) {
        Client jekson = new Client();
        Account account1 = new Account(2154877, true, 3500);
        Account account2 = new Account(2154876, false, -5000);
        Account account3 = new Account(2154878, true, 1000);
        Account account4 = new Account(2154879, true, 9600);
        jekson.setAccounts(Arrays.asList(account1, account2, account3, account4));
        print(jekson);
        jekson.setId(007);
        generalSum$(jekson);
        sum$(jekson);

    }
    private static void print(Client jek){

        List<Account> temp = jek.getAccounts();
        for (Account account : temp) {
            System.out.println(account);
        }

    }


    private static void generalSum$(Client jek) {
        List<Account> temp = jek.getAccounts();
        int sum = 0;
        for (Account account : temp) {
            sum += account.getSum();
        }
        System.out.println("Общая сумма счета: " + sum);
    }
    private static void sum$(Client jek) {
        List<Account> temp = jek.getAccounts();
        int sum = 0;
        for (Account account : temp) {
            if(account.getSum()<0)
            sum += account.getSum();
        }
        System.out.println("сумма отрицательных счетов: " + sum);
        sum = 0;
        for (Account account : temp) {
            if(account.getSum()>0)
                sum += account.getSum();
        }
        System.out.println("сумма положительных счетов: " + sum);
    }
}
