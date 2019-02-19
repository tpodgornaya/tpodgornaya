package com.playtika.automation.automation;

import java.util.Scanner;
import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

public class fio {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,6}));
        Scanner console = new Scanner(System.in);
        System.out.println("Введите e-mail: ");
        while (console.hasNextInt()) {
            String line = console.nextLine();
            if (pattern.matcher(line).matches()) {
                System.out.println("e-mail введена правильно! ");
                return;
            } else {
                System.out.println("e-mail введена неверно! ");
                System.out.println("Введите e-mail: ");
            }
        }
    }
}
