package com.playtika.automation.hello;

public class arr6 {

    public static void main(String[] args) {

        int[] numArr = {5, 4, 3, 2, 1};

        int maxNumber = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (maxNumber < numArr[i]) {
                maxNumber = numArr[i];
            }
        }

        System.out.println(maxNumber);
    }
}
