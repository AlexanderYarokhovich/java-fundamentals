package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;

import static java.util.Arrays.asList;

public class TrainRun {
    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("Minsk", 1255, LocalDateTime.of(2021, 05, 9, 15, 51)));
        trains.add(new Train("Brest", 1284, LocalDateTime.of(2021, 05, 9, 18, 05)));
        trains.add(new Train("vilnius", 1210, LocalDateTime.of(2021, 05, 9, 05, 30)));
        trains.add(new Train("Minsk", 1255, LocalDateTime.of(2021, 05, 9, 14, 00)));
        trains.add(new Train("Vitebsk", 1244, LocalDateTime.of(2021, 05, 9, 22, 20)));
        trains.add(new Train("Minsk", 1255, LocalDateTime.of(2021, 05, 9, 20, 00)));

        bubbleSort(trains);
        printToNumber(trains);
    }

    public static void bubbleSort(List<Train> trains) {
        int counter = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < trains.size(); i++) {
                Train tr1= trains.get(i);
                Train tr2= trains.get(i-1);
                if (tr1.getTrainNumber() < tr2.getTrainNumber()) {
                    swap(trains, i, i - 1);
                    needIteration = true;
                }
                else if (tr1.getTrainNumber() == tr2.getTrainNumber()) {

                    if (tr1.getDepartureTime().isBefore(tr2.getDepartureTime())){
                        swap(trains, i, i - 1);
                    }
                    //needIteration = true;
                }
                counter++;
            }
        }
        System.out.println("пузырек: " + counter);
        print(trains);
    }

    private static void swap(List<Train> trains, int ind1, int ind2) {
        Train tmp = trains.get(ind1);
        Train tmp2 = trains.get(ind2);
        trains.set(ind1, tmp2);
        trains.set(ind2, tmp);
    }
    private static void print(List<Train> trains) {
        for(Train tr: trains){
            System.out.println(tr);
        }
    }
    private static void printToNumber(List<Train> trains) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер поезда:");
        int number = sc.nextInt();
        for(Train tr: trains){
            if (tr.getTrainNumber()==number)
            System.out.println(tr);
        }
    }
}
