package com.playtika.automation.geometry;

public class Point {
    public float x;
    public float y;

    public float distance (Point otherPoint) {
        float deltaX = x - otherPoint.x;
        float deltaY = y - otherPoint.y;
        float vector = (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return vector;
    }
}
