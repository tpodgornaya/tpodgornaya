package com.playtika.automation.automation;
/* Пользователь задает длину массива (положительное число от 10 до 100).
Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberAtArray {
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
