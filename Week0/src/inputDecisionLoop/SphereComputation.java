package inputDecisionLoop;
import java.util.Scanner;

/**
 * 1. Prompt user for the radius
 * 2. Read inputs as "double"
 * 3. Compute the volume and surface area of the sphere
 * 4. Print the values rounded to 2 decimal places.
 */
public class SphereComputation {
    public static void main(String[] args) {
        //surfaceArea = 4 * Math.PI * radius * radius
        //volume = 4 /3 * Math.PI * radius * radius * radius

        // Declare variables
        double radius, volume, surfaceArea;

        // Prompt and read inputs as "double"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        in.close();

        // Compute in double
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (4 /3) * Math.PI * radius * radius * radius;

        //Print results using printf()
        System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);

    }
}
