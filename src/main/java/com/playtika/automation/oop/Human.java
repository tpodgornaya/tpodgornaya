package com.playtika.automation.oop;

public class Human {

    public String name;

    public int age;

    public void sayName() {
        System.out.printf("My name is %s, i'm %s\n", name, isOld());
    }

    private String isOld() {
        String result;

        if (age < 40) {
            result = "young";
        } else {
            result = "old";
        }
        return result;
    }
}
