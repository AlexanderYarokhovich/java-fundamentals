package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String middleName;
    private int groupNumber;
    private List<Integer> perform;

    public Student(String name, String surname, String middleName, int groupNumber, List<Integer> perform) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.groupNumber = groupNumber;
        this.perform = perform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Integer> getPerform() {
        return perform;
    }

    public void setPerform(List<Integer> perform) {
        this.perform = perform;
    }

    public Student() {
    }
}
