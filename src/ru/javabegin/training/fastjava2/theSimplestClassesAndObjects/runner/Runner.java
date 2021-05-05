package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.runner;

import ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model.Test1;
import ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model.Test2;

public class Runner {
    public static void main(String[] args) {
        Test1 a = new Test1();
        a.print();
        Test2 b = new Test2();
        Test2 c = new Test2(1,1);
    }
}
