package com.playtika.automation.automation;

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
