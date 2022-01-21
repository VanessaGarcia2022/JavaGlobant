package gettingStarted;

/*
* program to print the surface area, base area, and volume of a cylinder, given its radius and height (in doubles).
* You should use 5 double variables called radius, height, surfaceArea, baseArea and volume.
* Take note that space (blank) is not allowed in variable names.
*/
public class CylinderComputation {
    public static void main(String[] args) {

        double radius, height, surfaceArea, baseArea, volume;
        final double PI = 3.14159265;

        // Assing a value to adius and height
        radius = 3.5;
        height = 2.3;

        // computes surfaceArea = 2*PI*r*h
        surfaceArea = 2*PI*radius*height;

        //computes baseArea = 2*PI*(r*r)
        baseArea = 2*PI*(radius*radius);

        //computes volume = PI*(r*r)*h
        volume = PI*(radius*radius)*height;

        // Print results
        System.out.print("The surface area is ");
        System.out.println(surfaceArea);
        System.out.print("The base area is ");
        System.out.println(baseArea);
        System.out.print("The volume is ");
        System.out.println(volume);

    }
}
