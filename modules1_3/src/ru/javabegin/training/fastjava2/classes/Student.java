package ru.javabegin.training.fastjava2.classes;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate myBirthday;
    private String address;
    private int tel;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String surname, String name, String patronymic, LocalDate myBirthday, String address, int tel, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.myBirthday = myBirthday;
        this.address = address;
        this.tel = tel;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getMyBirthday() {
        return myBirthday;
    }

    public void setMyBirthday(LocalDate myBirthday) {
        this.myBirthday = myBirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", myBirthday=" + myBirthday +
                ", address='" + address + '\'' +
                ", tel=" + tel +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                tel == student.tel &&
                course == student.course &&
                surname.equals(student.surname) &&
                name.equals(student.name) &&
                Objects.equals(patronymic, student.patronymic) &&
                myBirthday.equals(student.myBirthday) &&
                Objects.equals(address, student.address) &&
                Objects.equals(faculty, student.faculty) &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, myBirthday, address, tel, faculty, course, group);
    }
}
