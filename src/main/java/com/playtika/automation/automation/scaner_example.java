package com.playtika.automation.automation;

import java.util.Scanner;

public class scaner_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String text = Integer.toString(num);

        int i = 0;
        int length = Integer.toString(num).length();

        while(i < length){
            char result = text.charAt(i++);
            System.out.println(result);
        }
    }
}
