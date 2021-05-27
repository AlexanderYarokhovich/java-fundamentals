package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model;

public class Counter {
        private int counter = 0;
        private final int topLimit = 10;
    public Counter() {
    }
    public boolean isTop(){
        return counter>=topLimit;
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getTopLimit() {
        return topLimit;
    }
}
