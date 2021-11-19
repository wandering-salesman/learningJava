package com.aditya.Assignment3.Basic;

public class Circle {
    private float radius;

    Circle() {
        radius = 1;
    }

    Circle(float r) {
        this.radius = r;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float area() {
        return 3.14f * radius * radius;
    }

    public float perimeter() {
        return 2f * 3.14f * radius;
    }
}