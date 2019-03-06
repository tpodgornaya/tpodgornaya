package com.playtika.automation.simpleExample;

public class App {
    public static void main(String[] args) {

        House myHome = new House();
        myHome.setFloorCount(11);
       myHome.addFloor();
        myHome.addSeveralFloors(1);
        myHome.addSeveralFloors(5);
        myHome.addSeveralFloors(10000);


    }
}
