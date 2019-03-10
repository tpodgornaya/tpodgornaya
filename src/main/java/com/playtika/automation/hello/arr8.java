package com.playtika.automation.hello;

import java.util.Scanner;

public class arr8 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ширину: ");
        int num = console.nextInt();

        int minWeight = 3;
        int maxWeight = 9;

        if (num < minWeight) {
            num = 3;
        }
        if (num > maxWeight) {
            num = 9;
        }

        for (int m = 0; m < num; m++) {
            System.out.print("***");
        }
        System.out.println("*");

        for (int i = 0; i < 4; i++) {

            for (int k = 0; k < num; k++) {
                System.out.print("*  ");
            }
            System.out.println("*");

            for (int s = 0; s < num; s++) {
                System.out.print("***");
            }
            System.out.println("*");
        }
    }
}