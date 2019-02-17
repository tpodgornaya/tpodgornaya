package com.playtika.automation.automation;

import java.util.Scanner;

public class HomeWork2_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число и нажмите Enter: ");
        long number = console.nextLong();
        System.out.printf("Сумма всех цифр = %d", sumNumber(number));
    }

    public static long sumNumber(long num) {
        long sum = 0;
        String word = num + "";
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            String currentNumber = word.substring(i, i+1);
            sum = sum + Long.parseLong(currentNumber);
        }


        return sum;
    }
}
