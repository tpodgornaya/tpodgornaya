package com.playtika.automation.automation;

public class task2 {
        public static void main(String[] args) {
            int x = 15;
            int y = 26;
            int z = 8;
            int n = 6;
            int result = (x + (50 - y * z) / n) - x;

            System.out.println("Result: " + result);

            System.out.println("x " + " + " + "(" + "50 " + "-" + " y " + "*" + " z" + ")" + "/" + "n" + ")" + "-" + " x" + " = " + result);

            System.out.printf("%d + (50 - %d * %d)/%d) - %d = %d", x, y, z, n, x, result);
        }
    }
