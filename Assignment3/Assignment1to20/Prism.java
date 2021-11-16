package Assignment1to20;

// Class has been written with the assumption that
// the prism has a equilateral triangular cross section. 
// But can be easily implemented to other shapes as well.
public class Prism {
    private float side;
    private float height;

    Prism() {
        side = 1;
        height = 1;
    }

    Prism(float side, float height) {
        this.side = side;
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public float surfaceArea() {
        return (float)((1/Math.sqrt(3))*side*side + 3*side*height);
    }
    public float volume() {
        return (float)((1/Math.sqrt(3))*side*side*height);
    }
}
