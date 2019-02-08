package com.playtika.automation.automation;

public class task1 {
    public static void main(String[] args) {
        long x = 550;
        long y = 110;
        long z = 50;
        long n = 20;
        long result = x - (y + 123) / z * n;

        System.out.println("Result: " + result);
        System.out.println ("x" + " - " + "(" + "y" + " + " + "123" + ") " + "/" + " z " + " * " + " n " + " = " + result);
        System.out.printf("%d - (%d + 123) / %d * %d = %d", x, y, z, n, result);
    }
}
