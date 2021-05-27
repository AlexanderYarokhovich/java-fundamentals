package ru.javabegin.training.fastjava2.arraysOfArrays;

import java.util.Scanner;
// В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
public class Task8 {

        public static int stolbec1;
        public static int stolbec2;

        public static void runner(){
            System.out.println("Введите размерность матрицы");
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            int multiArr[][] = new int[size][size];
            System.out.println("Введите приделы матрицы");
            int size2 = in.nextInt();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    multiArr[i][j] = (int) (Math.random() * ((size2 + size2) - size2));
                }
            }
            System.out.println("Дана матрица");
            for (int i = 0; i < multiArr.length; i++) {
                for (int j = 0; j < multiArr.length; j++) {
                    System.out.print(multiArr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Укажите намера каких столбцов хотите поменять местами?");
            stolbec1 = in.nextInt();
            stolbec2 = in.nextInt();
            System.out.println();

            for (int i = 0; i < multiArr.length; i++) {
                for (int j = 0; j < multiArr.length; j++) {
                    if (j == stolbec1) {
                        System.out.print(multiArr[i][stolbec2] + "\t");
                    } else if (j == stolbec2) {
                        System.out.print(multiArr[i][stolbec1] + "\t");
                    }else {
                        System.out.print(multiArr[i][j] + "\t");
                    }
                }
                System.out.println();
            }

        }
    }

