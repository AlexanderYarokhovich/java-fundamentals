package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.runner;

import ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model.Customer;

import java.util.*;

public class CustomerRun {
    public static void main(String[] args) {
        TreeSet<Customer> customers = new TreeSet<>();
        customers.add(new Customer(12459, "Petrov", "Ivan", "Ivanovich", "Minsk/Altayskay7", 2323, 777777));
        customers.add(new Customer(34789, "Ivanov", "Igar", "Vladimirovich", "Minsk/Baykalskay54", 1111, 654321));
        customers.add(new Customer(98328, "Smirnov", "Alesha", "Ivanovich", "Minsk/Nezavisimosti20", 5555, 437873));
        customers.add(new Customer(23439, "Grebcov", "Ivan", "Ravshanovich", "Minsk/Skarunu7", 4444, 294873));
        customers.add(new Customer(56876, "Lolankov", "LoL", "LoLavich", "Minsk/Altayskay7", 0000, 000000));


//        List<Customer> sort = customers.stream().sorted().collect(Collectors.toList());
//        print(sort);
        System.out.println(customers);
        alphabet(customers);
    }

    private static void print(List<Customer> customers) {
        for (Customer cust : customers) {
            System.out.println(cust);
        }
    }

    private static void alphabet(TreeSet<Customer> customers) {
        int min = 1111;
        int max = 4444;
        for (Customer cust : customers) {
            if(cust.getCreditCardNumber()>min&&cust.getCreditCardNumber()<=max){
                System.out.println(cust.getSurname());
            }
        }
    }
}





