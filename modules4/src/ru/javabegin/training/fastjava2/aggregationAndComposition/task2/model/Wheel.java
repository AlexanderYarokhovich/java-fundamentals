package ru.javabegin.training.fastjava2.aggregationAndComposition.task2.model;

public class Wheel {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Wheel(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "position='" + position + '\'' +
                '}';
    }
}
