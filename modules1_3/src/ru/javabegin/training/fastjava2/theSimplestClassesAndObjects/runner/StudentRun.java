package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.runner;

import ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRun {
    public static void main(String[] args) {
        List<Integer> perform0 = Arrays.asList(9,10,10,9,10);
        Student student1 = new Student("Igar", "Shafranski", "Igaravich", 23, perform0);
        List<Integer> perform1 = new ArrayList<>();
        perform1.add(8);
        perform1.add(4);
        perform1.add(7);
        perform1.add(6);
        perform1.add(5);
        Student student2 = new Student("Grisha", "Zelenuy", "stunda", 24, perform1);
        List<Integer> perform2 = new ArrayList<>();
        perform2.add(9);
        perform2.add(10);
        perform2.add(9);
        perform2.add(8);
        perform2.add(10);
        Student student3 = new Student("Aleksey", "Alesha", "LoL", 50, perform2);
        List<Integer> perform3 = new ArrayList<>();
        perform3.add(9);
        perform3.add(10);
        perform3.add(9);
        perform3.add(3);
        perform3.add(10);
        Student student4 = new Student("Reed", "RIP", "strem", 6, perform3);
        List<Integer> perform4 = new ArrayList<>();
        perform4.add(9);
        perform4.add(9);
        perform4.add(9);
        perform4.add(9);
        perform4.add(10);
        Student student5 = new Student("Galina", "Blanka", "BulBul", 23, perform4);
        List<Integer> perform5 = new ArrayList<>();
        perform5.add(10);
        perform5.add(10);
        perform5.add(10);
        perform5.add(10);
        perform5.add(10);
        Student student6 = new Student("Mark", "Cukerberg", "Igaravich", 12, perform5);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        for (Student st:students) {
            boolean val = printStudents(st);
            if(val==true){
                System.out.println(st.getName());
            }
        }
    }
    private static boolean printStudents(Student stud) {
        boolean print = true;
        for (int val : stud.getPerform()) {
            if (val < 9) {
                print = false;
            }
        }
        return print;
    }
}
