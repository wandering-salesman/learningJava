package com.aditya.Assignment3.Basic;

public class Rectangle {
    float length;
    float breadth;
    float height;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(float length) {
        this.length = length;
    }

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    float area() {
        return length * breadth;
    }

    float areaParallelogram() {
        return length * height;
    }

    float areaRhombus(float diagonal1, float diagonal2) {
        return diagonal1 * diagonal2 / 2;
    }

    float perimeter() {
        return (length + breadth) * 2;
    }
}
