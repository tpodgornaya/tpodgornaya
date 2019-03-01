package com.playtika.automation.guessword;

import java.util.Scanner;

public class GuessWord {
    private final WorldSource wordSource = new WorldSource();
    private final CharcterMixer charcterMixer = new CharcterMixer();

    public void playGame() {
        Scanner console = new Scanner(System.in);
        String word = wordSource.getWord();
        System.out.printf("Угадайте слово: %s%n", charcterMixer.mix(word));

        String userWord = console.nextLine();
        while (true) {
            if (word.equalsIgnoreCase(userWord)) {
                System.out.println("Умница!");
                break;
            } else {
                System.out.println("Не угадали");
                System.out.println("Попробуйте еще раз");
                userWord = console.nextLine();
            }
        }

    }
    public static void main(String[] args) {
        GuessWord guessWord = new GuessWord();
        guessWord.playGame();

    }
}
