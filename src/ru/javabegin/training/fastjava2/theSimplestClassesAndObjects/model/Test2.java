package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model;
//Создйте класс Test2 c двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
// инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
public class Test2 {
    private int x;
    private int y;

    public Test2() {
        this.x = 4;
        this.y = 5;
    }

    public Test2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
