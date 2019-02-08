package com.playtika.automation.automation;

public class task6 {
    public static void main(String[] args) {
        double x = 5;
        double y = 0;
        double z = 0;
        double n = Math.sqrt((x * x) + (y * y) + (z * z));

        double x1 = x / n;
        double y1 = y / n;
        double z1 = z / n;

        System.out.printf("(%.3f, %.3f, %.3f)", x1, y1, z1);
    }
}
