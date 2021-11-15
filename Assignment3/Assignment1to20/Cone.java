public class Cone {
    private float radius;
    private float height;
    private float slantHeight;

    Cone() {
        radius = 1;
        height = 1;
        slantHeight = (float)Math.sqrt(2);
    }

    Cone(float radius, float height) {
        this.radius = radius;
        this.height = 1;
        this.slantHeight = (float)Math.sqrt(radius*radius + height*height);
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
        this.slantHeight = (float)Math.sqrt(radius*radius + height*height);
    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
        this.slantHeight = (float)Math.sqrt(radius*radius + height*height);
    }
    public float getSlantHeight() {
        return slantHeight;
    }
    public float curvedSurvaceArea() {
        return (float)3.14*radius*slantHeight;
    }
    public float totalSurfaceArea() {
        return  (float)(3.14*radius*radius + 3.14*radius*slantHeight);
    }
    public float volume() {
        return (float)(0.33333*(3.14*radius*radius*height));
    }
}
