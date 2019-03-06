package com.playtika.automation.automation;

/* Пользователь вводит строку.
Программа разбивает строку на слова, и “переворачивает” каждое слово, формирует из новых слов предложение и выводит его на экран.*/

import java.util.Scanner;

public class ReverseWordsInSentence {
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
