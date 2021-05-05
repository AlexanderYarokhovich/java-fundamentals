package ru.javabegin.training.fastjava2.theSimplestClassesAndObjects;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class TriangleRun {
    public static void main(String[] args) {
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(10, 10, 10));
        triangles.add(new Triangle(9, 5, 5));
        triangles.add(new Triangle(7, 8, 10));
        triangles.add(new Triangle(3, 5, 7));
        area(triangles);
    }

    private static void area(List<Triangle> triangles) {
        for (Triangle tr : triangles) {
            int a = tr.getA();
            int b = tr.getB();
            int c = tr.getC();
            double per = a + b + c;
            double p = 0.5 * (a + b + c);
            double temp = p*(p-a)*(p-b)*(p-c);
            double s = sqrt(temp);
            System.out.println("Площадь = " + s);
            System.out.println("Периметр = " + per);
        }
    }
}
