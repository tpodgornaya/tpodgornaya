package com.playtika.automation.geometry;

public class Application {

    public static void main (String[] args) {
        Point p1 = new Point();
        p1.x = 1f;
        p1.y = 1f;

        Point p2 = new Point();
        p2.x = 2f;
        p2.y = 2f;


        System.out.println(p1.distance(p2));

    }
}
