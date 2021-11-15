public class Triangle {
    private float a;
    private float b;
    private float c;

    Triangle() {
        a = 1;
        b = 1;
        c = 1;
    }

    Triangle(float side) {
        this.a = this.b = this.c = side;
    }

    Triangle(float a, float b) {
        this.a = a;
        this.b = b;
        c = (float) Math.sqrt(a * a + b * b);
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    float area() {
        float s = (a + b + c) / 2;
        return (float) Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }

    float permieter() {
        return a + b + c;
    }
}