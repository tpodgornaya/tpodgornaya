package com.playtika.automation.hello;

public class arr5 {

    public static void main(String[] args) {

        int[] numArr = {5, 4, 3, 2, 1};

        int minNumber = 100;

        for (int i = 0; i < numArr.length; i++) {
            if (minNumber > numArr[i]) {
                minNumber = numArr[i];
            }
        }

        System.out.println(minNumber);
    }
}
