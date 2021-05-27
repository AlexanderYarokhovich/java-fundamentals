package ru.javabegin.training.fastjava2.aggregationAndComposition.task2.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String markAuto;
    private Boolean ignition;
    private Motor motor;
    private List<Wheel> wheels = new ArrayList<>();
    private int mileage;

    public Car(String markAuto, Boolean ignition, Motor motor, List<Wheel> wheels, int mileage) {
        this.markAuto = markAuto;
        this.ignition = ignition;
        this.motor = motor;
        this.wheels = wheels;
        this.mileage = mileage;
    }

    public Car() {
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarkAuto() {
        return markAuto;
    }

    public void setMarkAuto(String markAuto) {
        this.markAuto = markAuto;
    }

    public Boolean getIgnition() {
        return ignition;
    }

    public void setIgnition(Boolean ignition) {
        this.ignition = ignition;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "markAuto='" + markAuto + '\'' +
                ", ignition=" + ignition +
                ", motor=" + motor +
                ", wheels=" + wheels +
                ", mileage=" + mileage +
                '}';
    }
}
