package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private LocalTime departureTime;
    private DayOfWeek daysOfTheWeek;

    public Airline(String destination, int flightNumber, String aircraftType, LocalTime departureTime, DayOfWeek daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(DayOfWeek daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime +
                ", daysOfTheWeek=" + daysOfTheWeek +
                '}';
    }
}
