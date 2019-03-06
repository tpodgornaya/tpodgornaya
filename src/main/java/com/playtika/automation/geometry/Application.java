package com.playtika.automation.geometry;

public class Application {

    public static void main (String[] args) {
        Point p1 = new Point();
        p1.x = 1f;
        p1.y = 1f;

        Point p2 = new Point();
        p2.x = 2f;
        p2.y = 3f;

        Point p3 = new Point();
        p3.x = 2f;
        p3.y = 1f;

        Triangle myTrian = new Triangle();
        myTrian.a = p1;
        myTrian.b = p2;
        myTrian.c = p3;

        //System.out.println(p1.distance(p2));
        System.out.println(myTrian.perimeter());
        System.out.println(myTrian.square());
        System.out.println(myTrian.type());
    }
}
