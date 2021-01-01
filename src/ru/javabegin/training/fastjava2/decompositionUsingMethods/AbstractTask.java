package ru.javabegin.training.fastjava2.decompositionUsingMethods;


public abstract class AbstractTask {
    public int generateInt(int limit) {
        int randomInt = (int) (Math.random() * (limit + 1));
        System.out.println("генер случ число");
        System.out.print("A: " + randomInt);
        return randomInt;
    }
}

