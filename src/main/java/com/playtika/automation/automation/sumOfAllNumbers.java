package com.playtika.automation.automation;

/* Есть целое положительное число (long). Программа должна определить сумму цифр из которых состоит число. */

import java.util.Scanner;

public class sumOfAllNumbers {
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
