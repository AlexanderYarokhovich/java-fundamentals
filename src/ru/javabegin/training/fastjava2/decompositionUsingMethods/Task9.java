package ru.javabegin.training.fastjava2.decompositionUsingMethods;

import ru.javabegin.training.fastjava2.decompositionUsingMethods.utils.FourCorner;

//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади.
//положить эти объекты в массив. и рандомный объект.
public class Task9 {
    private FourCorner kvadrat = new FourCorner(4, 4, 4, 4);
    private FourCorner trap = new FourCorner(5, 3, 4, 3);
    private FourCorner prm = new FourCorner(4, 5, 4, 5);

    public void calc() {
        FourCorner[] arr = {kvadrat, trap, prm};
        int result = squareArea(arr[0]);
        System.out.println(result);
        result = areaOfTheTrapezium(arr[1]);
        System.out.println(result);
        result = areaOfaRectangle(arr[2]);
        System.out.println(result);
    }

    private int squareArea(final FourCorner figure) {
        return (int) Math.pow(figure.getX(), 2);
    }

    private int areaOfTheTrapezium(final FourCorner figure) {
        return (figure.getT() + figure.getX()) / 2 * figure.getY();
    }

    private int areaOfaRectangle(final FourCorner figure) {
        return figure.getX() * figure.getY();
    }

}
