package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.runner;

import ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model.Airline;
import ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model.DayOfWeek;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineRun {
    public static void main(String[] args) {
        List<Airline> airlines = new ArrayList<>();
        airlines.add(new Airline("Minsk", 12, "passengerPlane", LocalTime.of(18, 56), DayOfWeek.MONDAY));
        airlines.add(new Airline("Kiev", 78, "cargoAirplane", LocalTime.of(5, 11), DayOfWeek.FRIDAY));
        airlines.add(new Airline("Minsk", 47, "passengerPlane", LocalTime.of(12, 30), DayOfWeek.MONDAY));
        airlines.add(new Airline("Brest", 52, "passengerPlane", LocalTime.of(16, 40), DayOfWeek.TUESDAY));
        airlines.add(new Airline("Minsk", 99, "cargoAirplane", LocalTime.of(02, 25), DayOfWeek.FRIDAY));
        destination(airlines);
        week(airlines);
        daysAndTime(airlines);
    }

    private static void destination(List<Airline> airlines) {
        for (Airline air : airlines) {
            if (air.getDestination().equals("Minsk")) {
                System.out.println(air);
            }
        }
    }

    private static void daysAndTime(List<Airline> airlines) {
        for (Airline air : airlines) {
            if (air.getDaysOfTheWeek().equals(DayOfWeek.FRIDAY) && air.getDepartureTime().isAfter(LocalTime.of(03, 00))) {
                System.out.println(air);
            }
        }
    }

    private static void week(List<Airline> airlines) {
        for (Airline air : airlines) {
            if (air.getDaysOfTheWeek().equals(DayOfWeek.TUESDAY)) {
                System.out.println(air);
            }
        }
    }
}
