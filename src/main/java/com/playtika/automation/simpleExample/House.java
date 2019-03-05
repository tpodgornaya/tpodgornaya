package com.playtika.automation.simpleExample;

public class House {
    public int floors;

    public void addFloor() {
        floors += 1;
    }


    public void addSeveralFloors(int num) {
        floors += num;
    }

    public void setFloorCount(int floorsCount) {
        floors = floorsCount;
    }

    public void destroyHouse() {
        floors = 0;
    }
}
