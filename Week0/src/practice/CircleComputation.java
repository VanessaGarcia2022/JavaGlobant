package practice;

/**
 * Print the area and circumference of a circle, given its radius.
 */

public class CircleComputation {
    public static void main(String[] args) {
        // Declare 3 double variables to hold radius, area and circumference.
        // A "double" holds floating-point number with an optional fractional part.
        double radius, area, circumference;
        // Declare a double to hold PI.
        // Declare as "final" to specify that its value cannot be changed (i.e. constant).
        final double PI = 3.14159265;

        // Assign a value to radius. (We shall read in the value from the keyboard later.)
        radius = 1.2;
        // Compute area and circumference
        area = radius * radius * PI;
        circumference = 2.0 * radius * PI;

        // Print results
        System.out.print("The radius is ");  // Print description
        System.out.println(radius);          // Print the value stored in the variable
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The circumference is ");
        System.out.println(circumference);
    }
}
