package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод,
// который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
public class Test1 {
    public int x = 5;
    public int y = 47;

    public void print() {
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println(mostNumber(x,y));
        System.out.println(sumVariable(x,y));
    }

    private int sumVariable(int x, int y) {
        System.out.print("sum= ");
        int sum = x + y;
        return sum;
    }

    private int mostNumber(int x, int y) {
        System.out.print("max= ");
        return x >= y ? x : y;
    }
}
