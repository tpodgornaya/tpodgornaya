package com.playtika.automation.hello;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        String name = "Таня";
        String result = "";

        //result[0] = name[3];
        result =  result + name.charAt(3);
        result = result + name.charAt(2);
        result = result + name.charAt(1);
        result = result + name.charAt(0);




        for (int i = name.length() - 1; i >= 0; i--){
            result = result + name.charAt(i);
        }

        System.out.println(result);
    }
}
