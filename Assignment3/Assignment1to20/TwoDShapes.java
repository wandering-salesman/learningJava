package Assignment1to20;

import java.util.Scanner;

public class TwoDShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Circle:");
        Circle circ1 = new Circle();
        System.out.println("Radius of default circle: " + circ1.getRadius());
        System.out.println("Area of default circle: " + circ1.area());
        System.out.println("Perimeter of default circle: " + circ1.perimeter());
        System.out.print("\nNow set radius: ");
        circ1.setRadius(input.nextFloat());
        System.out.println("New radius is: " + circ1.getRadius());
        System.out.println("New area is: " + circ1.area());
        System.out.println("New perimeter is: " + circ1.perimeter());

        System.out.println("\n\n");

        System.out.println("Rectangle:\n");
        Rectangle rect1 = new Rectangle();
        System.out.println("Area of default rectangle: " + rect1.area());
        System.out.println("Perimeter of default rectangle: " + rect1.perimeter());
        System.out.print("Now set length and breadth: ");
        rect1.setBreadth(input.nextFloat());
        rect1.setLength(input.nextFloat());
        System.out.println("New length and breath are: " + rect1.getLength() + ", " + rect1.getBreadth());
        System.out.println("New area of rectangle: " + rect1.area());
        System.out.print("Now set height of parallelogram: ");
        rect1.setHeight(input.nextFloat());
        System.out.println("Area of parallelogram: " + rect1.areaParallelogram());
        System.out.print("Enter diagonal of rhombus: ");
        System.out.println("Area of rhombus: " + rect1.areaRhombus(input.nextFloat(), input.nextFloat()));

        System.out.println("\n\n");

        System.out.println("Triangle:\n");

        Triangle tri1 = new Triangle();
        System.err.println("Default area of triangle: " + tri1.area());
        System.out.println("Default perimeter of triangle: " + tri1.permieter());
        System.out.print("Now set sides of triangle: ");
        tri1.setA(input.nextFloat());
        tri1.setB(input.nextFloat());
        tri1.setC(input.nextFloat());
        System.out.println("New area is: " + tri1.area());
        System.out.println("New perimeter is: " + tri1.permieter());
        System.out.println("Using the getClass() method: " + tri1.getClass());

        input.close();
    }

}