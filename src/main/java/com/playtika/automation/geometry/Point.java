package com.playtika.automation.geometry;

public class Point {
    private float x;
    private float y;

    public float distance (Point otherPoint) {
        float deltaX = getX() - otherPoint.getX();
        float deltaY = getY() - otherPoint.getY();
        float vector = (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return vector;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
