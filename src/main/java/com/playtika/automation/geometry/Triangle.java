package com.playtika.automation.geometry;

import java.util.concurrent.ThreadLocalRandom;

public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    public float perimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    public float square() {
        float p = perimeter() / 2;
        return (float) Math.sqrt(p * (p - a.distance(b)) * (p - b.distance(c)) * (p - c.distance(a)));
    }

    public String type() {
        float s1 = a.distance(b);
        float s2 = b.distance(c);
        float s3 = c.distance(a);

        if (s1 == s2 && s2 == s3 && s3 == s1) {
            return "равносторонний";
        }

        if (s1 == s2 || s2 == s3 || s3 == s1) {
            return "равнобедренный";
        }

        if ((s1 * s1 + s2 * s2 == s3 * s3)
                || (s2 * s2 + s3 * s3 == s1 * s1)
                || (s3 * s3 + s1 * s1 == s2 * s2)) {
            return "прямоугольный";
        }

        return "произвольный";
    }


}
