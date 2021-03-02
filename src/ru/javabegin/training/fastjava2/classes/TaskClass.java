package ru.javabegin.training.fastjava2.classes;

import java.time.LocalDate;
import java.util.Scanner;

public class TaskClass {
    public static void main(String[] args) {
        Student student1 = new Student(8877459, "Petrov", "Vitya", "Viktorovich", LocalDate.of(1988, 3, 12), "Kalinovskogo 35", 294123456, "FKT", 5, "12D");
        Student student2 = new Student(8877460, "Ivanov", "Petya", "Viktorovich", LocalDate.of(1995, 5, 25), "Griboedova 35", 33485455, "FBHF", 4, "13D");
        Student student3 = new Student(8877461, "Sidarov", "Nikolay", "Viktorovich", LocalDate.of(1992, 9, 30), "Kupalovskogo 35", 29475754, "FBHF", 6, "14D");
        Student student4 = new Student(8877462, "Smirnov", "Syslik", "Viktorovich", LocalDate.of(1991, 12, 2), "Kostushki 35", 294856784, "FBHF", 5, "17D");
        Student student5 = new Student(8877463, "Kuznetcov", "Pypsik", "Viktorovich", LocalDate.of(1990, 11, 14), "Cetkin 35", 444856984, "FKT", 5, "14D");
        Student student6 = new Student(8877464, "Kazlov", "Goplik", "Viktorovich", LocalDate.of(1990, 1, 6), "Masherova 35", 297586784, "FKT", 1, "19D");
        Student student7 = new Student(8877465, "Baranov", "Kroplik", "Viktorovich", LocalDate.of(1988, 3, 4), "Nexta 35", 44488558, "FBHF", 2, "22D");
        Student student8 = new Student(8877466, "Butrik", "Vikentiy", "Viktorovich", LocalDate.of(1989, 4, 24), "klizm 35", 444856784, "FBHF", 3, "27D");
        Student student9 = new Student(8877467, "Shmytrik", "Rugoruch", "Viktorovich", LocalDate.of(1993, 7, 9), "Mord 35", 334847584, "FBHF", 4, "96D");
        Student[] students = new Student[9];
        String f = "aaa";
        String d = "aaa";

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;
        students[7] = student8;
        students[8] = student9;
        System.out.println("Vvedite fak");
        Scanner vvod = new Scanner(System.in);
        String faculty = vvod.nextLine();
        System.out.println("Vvedite course");
        int course = vvod.nextInt();
        for (Student stud : students) {
            if (faculty.equals(stud.getFaculty()) && course == stud.getCourse()) {
                System.out.println(stud);
            }
        }
    }
}
