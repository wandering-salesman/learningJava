package Assignment1to20;

public class Sphere {
    private float radius;

    Sphere() {
        radius = 1;
    }
    
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float surfaceArea() {
        return (float)(4*3.14*radius*radius);
    }
    public float volume() {
        return (float)((4/3)*3.14*radius*radius*radius);
    }
}
