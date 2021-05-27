package ru.javabegin.training.fastjava2.sorting;


public class Runner {
    public static void main(String[] args) {
        SortUtils utils = new SortUtils();
        int [] arr = utils.generateMass();

        Task1 a = new Task1();
        a.runner();

        Task2 b = new Task2();
        b.bubbleSort(arr);        //Реализуйте сортировку обменами.
        Task3 c = new Task3();
        c.sortVstavkami(arr);     // Реализуйте сортировку вставками. Почемуто, когда смотреть со всеми сортировками то пишет 0 вставок, хотя если все лишние закоментить, то норм выходит, может я нетак считаю?
        Task4 d = new Task4();
        d.sortVuborom(arr);       //Реализуйте сортировку выбором.
        Task5 e = new Task5();
        e.sortShella(arr);          //Реализуйте сортировку Шелла.
    }
}

