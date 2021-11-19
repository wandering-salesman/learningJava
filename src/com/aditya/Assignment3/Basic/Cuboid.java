package com.aditya.Assignment3.Basic;

class Cuboid {
    float length;
    float breadth;
    float height;
    Cuboid() {
        length = 1;
        breadth = 1;
        height = 1;
    }

    Cuboid(float l, float b, float h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    float volume () {
        return length*breadth*height;
    }

    float surfaceArea() {
        return (float)(2.0*(length*height + height*breadth + length*breadth));
    }

}