package com.playtika.automation.automation;

import java.util.Scanner;

public class HomeWork2_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ширину: ");
        int width = console.nextInt();
        if (width < 3) {
            width = 3;
        }
        if (width > 9) {
            width = 9;
        }
        int height = width / 3;
    }
}
