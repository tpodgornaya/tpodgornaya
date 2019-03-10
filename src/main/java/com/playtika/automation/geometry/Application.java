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
            list[i] = buildNewTriange();
            if (serchTriang == 1 && list[i].type().equals("равнобедренный")) {
                System.out.printf("Найден %s треугольник.\n", list[i].type());
                System.out.printf("Индекс: %s\n", i);
                System.out.printf("Треугольник [a(%s;%s), b(%s;%s), c(%s;%s)\n", list[i].a.x, list[i].a.y, list[i].b.x, list[i].b.y, list[i].c.x, list[i].c.y);
                System.out.printf("Периметр: %s\n", list[i].perimeter());
                System.out.printf("Площадь: %s\n", list[i].square());
            }
            if (serchTriang == 2 && list[i].type().equals("равносторонний")) {
                System.out.printf("Найден %s треугольник.\n", list[i].type());
                System.out.printf("Индекс: %s\n", i);
                System.out.printf("Треугольник [a(%s;%s), b(%s;%s), c(%s;%s)\n", list[i].a.x, list[i].a.y, list[i].b.x, list[i].b.y, list[i].c.x, list[i].c.y);
                System.out.printf("Периметр: %s\n", list[i].perimeter());
                System.out.printf("Площадь: %s\n", list[i].square());
            }
            if (serchTriang == 3 && list[i].type().equals("прямоугольный")) {
                System.out.printf("Найден %s треугольник.\n", list[i].type());
                System.out.printf("Индекс: %s\n", i);
                System.out.printf("Треугольник [a(%s;%s), b(%s;%s), c(%s;%s)\n", list[i].a.x, list[i].a.y, list[i].b.x, list[i].b.y, list[i].c.x, list[i].c.y);
                System.out.printf("Периметр: %s\n", list[i].perimeter());
                System.out.printf("Площадь: %s\n", list[i].square());
            }
            if (serchTriang == 4 && list[i].type().equals("произвольный")) {
                System.out.printf("Найден %s треугольник.\n", list[i].type());
                System.out.printf("Индекс: %s\n", i);
                System.out.printf("Треугольник [a(%s;%s), b(%s;%s), c(%s;%s)\n", list[i].a.x, list[i].a.y, list[i].b.x, list[i].b.y, list[i].c.x, list[i].c.y);
                System.out.printf("Периметр: %s\n", list[i].perimeter());
                System.out.printf("Площадь: %s\n", list[i].square());
            }
        }
    }

    public static Triangle buildNewTriange() {
        Point p1 = new Point();
        p1.x = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
        p1.y = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);

        Point p2 = new Point();
        p2.x = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
        p2.y = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);

        Point p3 = new Point();
        p3.x = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
        p3.y = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);

        Triangle myTrian = new Triangle();
        myTrian.a = p1;
        myTrian.b = p2;
        myTrian.c = p3;

        return myTrian;
    }
}
