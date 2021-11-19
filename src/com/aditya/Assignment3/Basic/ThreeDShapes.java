package com.aditya.Assignment3.Basic;

import java.util.Scanner;
public class ThreeDShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cone cone1 = new Cone();
        System.out.println("Cone: ");
        System.out.println("Default values: ");
        System.out.println("Radius: " + cone1.getRadius());
        System.out.println("Height: " + cone1.getHeight());
        System.out.println("Slant height: " + cone1.getSlantHeight());
        System.out.println("Curved surface area: " + cone1.curvedSurvaceArea());
        System.out.println("Total surface area: " + cone1.totalSurfaceArea());
        System.out.println("Volume: " + cone1.volume());
        System.out.print("Now set radius and height: ");
        cone1.setRadius(input.nextFloat());
        cone1.setHeight(input.nextFloat());
        System.out.println("Modified values: ");
        System.out.println("Radius: " + cone1.getRadius());
        System.out.println("Height: " + cone1.getHeight());
        System.out.println("Slant height: " + cone1.getSlantHeight());
        System.out.println("Curved surface area: " + cone1.curvedSurvaceArea());
        System.out.println("Total surface area: " + cone1.totalSurfaceArea());
        System.out.println("Volume: " + cone1.volume());

        System.out.println("\n\n");

        Cylinder cylin1 = new Cylinder();
        System.out.println("Cylinder: ");
        System.out.println("Default values:");
        System.out.println("Radius: " + cylin1.getRadius());
        System.out.println("Height: " + cylin1.getHeight());
        System.out.println("Curved surface area: " + cylin1.curvedSurfaceArea());
        System.out.println("Total surface area: " + cylin1.totalSurfaceArea());
        System.out.println("Volume: " + cylin1.volume());
        System.out.print("Now set radius and height: ");
        cylin1.setRadius(input.nextFloat());
        cylin1.setHeight(input.nextFloat());
        System.out.println("Modified values: ");
        System.out.println("Radius: " + cone1.getRadius());
        System.out.println("Height: " + cone1.getHeight());
        System.out.println("Curved surface area: " + cone1.curvedSurvaceArea());
        System.out.println("Total surface area: " + cone1.totalSurfaceArea());
        System.out.println("Volume: " + cone1.volume());


        System.out.println("\n\n");

        Sphere sph1 = new Sphere();
        System.out.println("Sphere: ");
        System.out.println("Default values: ");
        System.out.println("Radius: " + sph1.getRadius());
        System.out.println("Surface area: " + sph1.surfaceArea());
        System.out.println("Volume: " + sph1.volume());
        System.out.print("Now set radius: ");
        sph1.setRadius(input.nextFloat());
        System.out.println("Modified values: ");
        System.out.println("Radius: " + sph1.getRadius());
        System.out.println("Surface area: " + sph1.surfaceArea());
        System.out.println("Volume: " + sph1.volume());
        

        System.out.println("\n\n");

        Prism pris1 = new Prism();
        System.out.println("Prism: ");
        System.out.println("Default values: ");
        System.out.println("Side: " + pris1.getSide());
        System.out.println("Height: " + pris1.getHeight());
        System.out.println("Surface area: " + pris1.surfaceArea());
        System.out.println("Volume: " + pris1.volume());
        System.out.print("Now change side and height: ");
        pris1.setSide(input.nextFloat());
        pris1.setHeight(input.nextFloat());
        System.out.println("Modified values: ");
        System.out.println("Side: " + pris1.getSide());
        System.out.println("Height: " + pris1.getHeight());
        System.out.println("Surface area: " + pris1.surfaceArea());
        System.out.println("Volume: " + pris1.volume());
    

        input.close();
    }
}
