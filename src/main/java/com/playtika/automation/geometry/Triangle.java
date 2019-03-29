package com.playtika.automation.geometry;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public float perimeter() {
        return getA().distance(getB()) + getB().distance(getC()) + getC().distance(getA());
    }

    public float square() {
        float p = perimeter() / 2;
        return (float) Math.sqrt(p * (p - getA().distance(getB())) * (p - getB().distance(getC())) * (p - getC().distance(getA())));
    }

    public String type() {
        float s1 = getA().distance(getB());
        float s2 = getB().distance(getC());
        float s3 = getC().distance(getA());

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


    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
}
