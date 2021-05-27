package ru.javabegin.training.fastjava2.aggregationAndComposition.task5.model;

import java.util.Objects;

public class TouristVouchers implements Comparable<TouristVouchers> {
    private String typeOfRest;
    private String transport;
    private String food;
    private int numberOfDays;

    public TouristVouchers(String typeOfRest, String transport, String food, int numberOfDays) {
        this.typeOfRest = typeOfRest;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
    }

    public TouristVouchers() {
    }

    public String getTypeOfRest() {
        return typeOfRest;
    }

    public void setTypeOfRest(String typeOfRest) {
        this.typeOfRest = typeOfRest;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return "TouristVouchers{" +
                "typeOfRest='" + typeOfRest + '\'' +
                ", transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", numberOfDays=" + numberOfDays +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TouristVouchers that = (TouristVouchers) o;
        return numberOfDays == that.numberOfDays &&
                Objects.equals(typeOfRest, that.typeOfRest) &&
                Objects.equals(transport, that.transport) &&
                Objects.equals(food, that.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfRest, transport, food, numberOfDays);
    }

    @Override
    public int compareTo(TouristVouchers touristVouchers) {
        return 0;
    }
}
