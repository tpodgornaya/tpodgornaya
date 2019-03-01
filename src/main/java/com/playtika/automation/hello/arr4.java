package com.playtika.automation.hello;

public class arr4 {

    public static void main(String[] args) {

        int[] numArr = {5, 4, 3, 2, 1};

        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum = sum + numArr[i];
        }
        int middle = sum/numArr.length;

        System.out.println(middle);
    }
}
