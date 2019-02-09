package com.playtika.automation.automation;

import java.util.Scanner;

public class lesson3_example {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите расстояние в километрах и нажмите Enter: ");
        float km = console.nextFloat();
        System.out.println("Введите время в минутах и нажмите Enter: ");
        float min = console.nextFloat();
        float m = km * 1000;
        float sec = min * 60;
        float result = m / sec;
        System.out.printf("Ваша сорость равна = %f ", result);
    }


}
