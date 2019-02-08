package com.playtika.automation.automation;
/*
Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость:
        а) одной покупки из 300 г конфет и 400 г печенья;
        б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
*/

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите стоимость 1 киллограма кконфет и нажми  Enter: ");
        float CandiesPrice = console.nextInt();
        System.out.println("Введите стоимость 1 киллограма печенья и нажми  Enter: ");
        float CookiesPrice = console.nextInt();

        System.out.println("Стоимость вашей покупки: " + calculatePrice(CandiesPrice, CookiesPrice));
    }

    public static float calculatePrice(float candiesKgPrice, float cookiesKgPrice) {
        float orderPrice = (0.3f * candiesKgPrice) + (0.4f * cookiesKgPrice);
        return orderPrice;
    }
}