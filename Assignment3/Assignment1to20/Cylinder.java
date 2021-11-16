package Assignment1to20;

public class Cylinder {
    private float radius;
    private float height;

    Cylinder() {
        this.radius = 1;
        this.height = 1;
    }
    Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float curvedSurfaceArea() {
        return (float)(3.14*radius*height);
    }
    public float totalSurfaceArea() {
        return (float)(3.14*radius*radius + 3.14*radius*height);
    }
    public float volume() {
        return (float)(3.14*radius*radius*height);
    }
}
