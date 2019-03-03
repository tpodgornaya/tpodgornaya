package com.playtika.automation.oop;

public class example {

    public static void main(String[] args) {


        Human oleksii = new Human();
        oleksii.name = "Oleksii";
        oleksii.age = 31;
        Person tetiana = new Person();
        tetiana.mood = "Good";
        tetiana.name = "Tetiana";
        tetiana.age = 29;

        oleksii.ageDifference(tetiana);

        tetiana.sayName();
        oleksii.sayName();
        System.out.print("");
    }
}
