package ru.javabegin.training.fastjava2.decompositionUsingMethods;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое большое
// расстояние. Указание. Координаты точек занести в массив.
public class Task4 {
    public void ploskost() {
        int max;//рандомно задам координаты точек. до 10
        int x1 = (int) (Math.random() * (10 + 1));
        int x2 = (int) (Math.random() * (10 + 1));
        int x3 = (int) (Math.random() * (10 + 1));
        int y1 = (int) (Math.random() * (10 + 1));
        int y2 = (int) (Math.random() * (10 + 1));
        int y3 = (int) (Math.random() * (10 + 1));
        System.out.println("Точка А(" + x1 + "," + y1 + ")");
        System.out.println("Точка B(" + x2 + "," + y2 + ")");
        System.out.println("Точка C(" + x3 + "," + y3 + ")");
        int rast1 = rasstoyanie(x1, x2, y1, y2);
        String distanceAB = "Расстояние между А и В ";
        System.out.println(distanceAB + rast1);
        int rast2 = rasstoyanie(x1, x3, y1, y3);
        String distanceAC = "Расстояние между А и C ";
        System.out.println(distanceAC + rast2);
        int rast3 = rasstoyanie(x2, x3, y2, y3);
        String distanceBC = "Расстояние между B и C ";
        System.out.println(distanceBC + rast3);
        String maxDist = distanceAB;
        max = rast1;
        if(rast2 >= max){
            max = rast2;
            maxDist = distanceAC;
        }
        if(rast3 >= max){
            max = rast3;
            maxDist = distanceBC;
        }
        System.out.println(maxDist + "максимальное!");
    }

    private int rasstoyanie(int x1, int x2, int y1, int y2) {
        double k = 0;// k это расстояние между 2мя точками
        k = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        return (int) k;
    }
}
