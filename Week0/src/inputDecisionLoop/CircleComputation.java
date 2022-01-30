package inputDecisionLoop;
import java.util.Scanner;

/**
 *  1. Prompt user for the radius
 *  2. Read inputs as "double"
 *  3. Compute the diameter, circumference, and area of the circle
 *  4. Print the values rounded to 2 decimal places.
 */
public class CircleComputation {
    public static void main(String[] args) {
        // diameter = 2.0 * radius
        // area = Math.PI * radius * radius
        // circumference = 2.0 * Math.PI * radius

        // Declare variables
        double radius, diameter, circumference, area;

        // Prompt and read inputs as "double"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        in.close();

        // Compute in double
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);
    }

}
