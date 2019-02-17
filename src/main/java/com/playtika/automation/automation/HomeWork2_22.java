package com.playtika.automation.automation;

import java.util.Scanner;

public class HomeWork2_22 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String inputWords = console.nextLine();
        String[] words = inputWords.split(" ");


        String result = "";
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            StringBuilder builderWord = new StringBuilder(currentWord);
            String reverseWord = builderWord.reverse().toString();

            result = result + " " + reverseWord;
        }
        System.out.println(result);
    }
}
