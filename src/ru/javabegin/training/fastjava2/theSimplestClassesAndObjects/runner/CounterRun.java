package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects;

import java.util.List;

public class CounterRun {
    public static void main(String[] args) {
        Counter counter = new Counter(5);
        inkrement(counter);
        print(counter);
        dekrement(counter);
        dekrement(counter);
        dekrement(counter);
        print(counter);
    }
    private static void inkrement(Counter counter) {
        if(counter.isTop()) {
            int count = counter.getCounter();
            count++;
            counter.setCounter(count);
        }
    }
    private static void dekrement(Counter counter) {
        if(counter.isTop()) {
            int count = counter.getCounter();
            count--;
            counter.setCounter(count);
        }
    }
    private static void print(Counter counter) {
           System.out.println("counter = " + counter.getCounter());
    }
}
