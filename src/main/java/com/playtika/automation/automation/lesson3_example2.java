package com.playtika.automation.automation;

import java.util.Scanner;

public class lesson3_example2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите стоимость 1 кг конфет и нажмити Enter: ");
        float candies = console.nextInt();
        System.out.println("Введите стоимость 1 кг печенья и нажмите Enter: ");
        float cookies = console.nextInt();
        System.out.printf("Стоимость вашей покупки: %f", calculateOrder(candies, cookies));
    }
    public static float calculateOrder (float candiesOr, float cookiesOr) {


        float order = (1 * candiesOr) * 2 + (1.8f * cookiesOr);
        return order;
    }
}
