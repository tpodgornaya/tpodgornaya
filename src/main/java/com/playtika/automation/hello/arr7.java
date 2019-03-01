package com.playtika.automation.hello;

public class arr7 {

    public static void main(String[] args) {

        String[] upperCase = {"A", "B", "C", "D", "E"};
        String[] lowerCase = {"a", "b", "c", "d", "e"};



        for (int i = 0; i < upperCase.length; i++) {
            //System.out.println(upperCase[i]);
            for (int k = 0; k < lowerCase.length; k++) {
                System.out.print(upperCase[i] + lowerCase[k]);

                //System.out.println("----" + lowerCase[k]);
            }
            System.out.println("");

        }

        //System.out.println(maxNumber);
    }
}
