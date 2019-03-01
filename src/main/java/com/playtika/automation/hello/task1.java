package com.playtika.automation.hello;

public class task1 {
    public static void main (String[] args) {
        long[] numbers = {-1, 0, 12, 65, -3, 11};

        long result = -100;

        for (int i = 0; i < numbers.length; i++) {
            long currentNumber = numbers[i];
            if (result < currentNumber && currentNumber < 0) {
                result = currentNumber;
            }
        }
        System.out.println(result);
    }
}
