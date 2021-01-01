package ru.javabegin.training.fastjava2.decompositionUsingMethods;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
public class Task3 {
    public void hexagon() {
        double S;
        double a = (int) (Math.random() * (10 + 1));
        System.out.println("сторона а = " + a);
        double s = triangle(a);
        S = s * 6;
        System.out.println("площадь треугольника = " + s);
        System.out.println("площадь гуксагона = " + S);
    }

    private double triangle(double a) {
        double s = sqrt(3) * pow(a, 2) / 4;
        return s;
    }
}
