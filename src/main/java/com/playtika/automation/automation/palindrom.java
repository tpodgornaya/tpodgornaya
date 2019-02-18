package com.playtika.automation.automation;

/* Пользователь вводит последовательность символов.
Программа должна определить, является ли последовательность палиндромом.
Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае.*/

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = console.nextLine();
        StringBuilder reversWord = new StringBuilder(word);
        if (word.equals(reversWord.reverse().toString())) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
