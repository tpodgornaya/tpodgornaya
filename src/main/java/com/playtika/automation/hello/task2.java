package com.playtika.automation.hello;

public class task2 {
    public static void main(String[] args) {

        long[] numbers = {-1, 0, 12, 65, -3, 11};

        long[] result = new long[numbers.length];

        /*result[0] = numbers[5];  //5 = 6 - 1
        result[1] = numbers[4];    //4 = 6 - 2
        result[2] = numbers[3];    //3 = 6 - 3
        result[3] = numbers[2];    //2 = 6 - 4
        result[4] = numbers[1];    //1 = 6 - 5
        result[5] = numbers[0];    //0 = 6 - 6*/

        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[numbers.length - (i + 1)];

        }

        System.out.printf("");
    }
}
