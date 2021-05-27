package ru.javabegin.training.fastjava2.aggregationAndComposition.task2.service;

import ru.javabegin.training.fastjava2.aggregationAndComposition.task2.model.Car;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task2.model.Motor;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task2.model.Wheel;

import java.util.ArrayList;
import java.util.List;

public class CarRun {
    public void printMarkAuto(Car car){
        System.out.println(car.getMarkAuto());
    }

    public void drive5km(Car car){
        if (car.getIgnition()== false){
            car.setIgnition(true);
        }
        int temp = car.getMileage();
        temp += 5;
        car.setMileage(temp);
        System.out.println(car.getMarkAuto() + " mileage " + car.getMileage());
    }
     public void changeWheel(Car car, int wheelToReplace, Wheel wheel){
        car.getWheels().set(wheelToReplace, wheel);
         System.out.println("поменяли колесо " + wheelToReplace);
     }
}
