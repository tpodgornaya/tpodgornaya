package com.playtika.automation.automation;

public class task4 {
    public static void main(String[] args) {
        double x = 22;
        double y = 77;
        double z = 3;
        double n = 5;
        double Result = -x / -y + z / (n + 15);

        System.out.println("Result:" + Result);

        System.out.println("-" + "x" + "/" + " -" + "y" + " + " + "z" + "/" + "(" + "n" + " + " + "15" + ")" + "=" + Result);

        System.out.printf("-%f/ -%f + %f / (%f + 15) = %f", x, y, z, n, Result);
    }
}
