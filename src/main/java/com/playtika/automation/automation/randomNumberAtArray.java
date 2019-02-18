package com.playtika.automation.automation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class randomNumberAtArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("длина массива ");
        int num =  console.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] %3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
