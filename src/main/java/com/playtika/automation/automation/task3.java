package com.playtika.automation.automation;

public class task3 {
    public static void main(String[] args) {
       float x = 577;
       float y = 10;
       float z = 22;
       float n = 7;
       Float result = x / (y * (z - 1) - 564) + n;

       System.out.println("Result: " + result);

       System.out.println("x " + "/" + "(" + "y" + " * " + "(" + "z " + "-" + " 1" + ")" + " + " + "n" + " = " + result);

        System.out.printf("%f /(%f * (%f - 1) - 564) + %f = %f", x, y, z, n, result);;

    }
}
