package com.playtika.automation.geometry;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Application {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите класс треугольника для поиска: \n" +
                "1. Равнобедренный \n" +
                "2. Равносторонний \n" +
                "3. Прямоугольный \n" +
                "4. Произвольный \n");
        int serchTriang = console.nextInt();

        Triangle[] list = new Triangle[100000];
        for (int i = 0; i < list.length; i++) {
            list[i] = buildNewTriangle();
            if ((serchTriang == 1) && list[i].type().equals("равнобедренный")) {
                printTriangle(list, i);
            }
            if ((serchTriang == 2) && list[i].type().equals("равносторонний")) {
                printTriangle(list, i);
            }
            if ((serchTriang == 3) && list[i].type().equals("прямоугольный")) {
                printTriangle(list, i);
            }
            if ((serchTriang == 4) && list[i].type().equals("произвольный")) {
                printTriangle(list, i);
            }
        }
    }

    private static void printTriangle(Triangle[] list, int i) {
        System.out.printf("Найден %s треугольник.\n", list[i].type());
        System.out.printf("Индекс: %s\n", i);
        System.out.printf("Треугольник [a(%s;%s), b(%s;%s), c(%s;%s)]\n", list[i].getA().getX(), list[i].getA().getY(), list[i].getB().getX(), list[i].getB().getY(), list[i].getC().getX(), list[i].getC().getY());
        System.out.printf("Периметр: %s\n", list[i].perimeter());
        System.out.printf("Площадь: %s\n", list[i].square());
    }

    public static Triangle buildNewTriangle() {
        Point p1 = new Point();
        p1.setX((float) Math.random());
        p1.setY((float) Math.random());

        Point p2 = new Point();
        p2.setX((float) Math.random());
        p2.setY((float) Math.random());

        Point p3 = new Point();
        p3.setX((float) Math.random());
        p3.setY((float) Math.random());

        Triangle myTrian = new Triangle();
        myTrian.setA(p1);
        myTrian.setB(p2);
        myTrian.setC(p3);

        return myTrian;
    }
}
