package ru.javabegin.training.fastjava2.aggregationAndComposition.task2;

import ru.javabegin.training.fastjava2.aggregationAndComposition.task2.model.Car;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task2.model.Motor;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task2.model.Wheel;
import ru.javabegin.training.fastjava2.aggregationAndComposition.task2.service.CarRun;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CarRun carRun = new CarRun();
        Wheel wheel1 = new Wheel("1");
        Wheel wheel2 = new Wheel("2");
        Wheel wheel3 = new Wheel("3");
        Wheel wheel4 = new Wheel("4");
        Wheel wheel5 = new Wheel("5");
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);
        wheels.add(wheel4);
        wheels.add(wheel5);
        Car car1 = new Car("honda",false, new Motor("95"), wheels, 123000);
        Car car2 = new Car("audi",true, new Motor("92"), wheels, 58000);
        Car car3 = new Car("bmw",false, new Motor("95"), wheels, 149000);
        Car car4 = new Car("ford",false, new Motor("DT"), wheels, 14000);
        carRun.printMarkAuto(car1);
        carRun.drive5km(car2);
        carRun.changeWheel(car3, 1, wheel5);
    }
}
