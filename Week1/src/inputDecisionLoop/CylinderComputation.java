package inputDecisionLoop;
import java.util.Scanner;

/**
 * 1. Prompt user for the base radius and height
 * 2. Read inputs as "double"
 * 3. Compute the base area, surface area, and volume of the cylinder
 * 4. Print the values rounded to 2 decimal places.
 */
public class CylinderComputation {
    public static void main(String[] args) {
        //baseArea = Math.PI * radius * radius
        //surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea
        //volume = baseArea * height

        // Declare variables
        double radius, height, baseArea, surfaceArea, volume;

        //Prompt user for the radius and height
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base radius: ");
        radius = in.nextDouble();
        System.out.print("Enter the height: ");
        height = in.nextDouble();
        in.close();

        //Compute in double
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;

        // Print using printf(%.2f%n)
        System.out.printf("The Base Area is: %.2f%n", baseArea );
        System.out.printf("The Surface Area is: %.2f%n", surfaceArea );
        System.out.printf("The volume is: %.2f%n", volume );

    }
}
