package inputDecisionLoop;
import java.util.Scanner;

/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum, product, min, max in "int"
 * 4. Print the result
 */

public class SumProductMinMax3 {
    public static void main(String[] args) {
        // Declare variables
        int number1, number2, number3, sum, product, min, max;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();
        System.out.print("Enter third integer: ");
        number3 = in.nextInt();
        in.close();

        // compute sum
        sum = number1 + number2 + number3;

        // compute product
        product = number1 * number2 * number3;

        // Compute min
        // The "coding pattern" for computing min is:
        // 1. Set min to the first item
        // 2. Compare current min with the second item and update min if second item is smaller
        // 3. Repeat for the next item
        min = number1;
        if(number2 < min){
            min = number2;
        }
        if(number3 < min){
            min = number3;
        }

        // Compute max
        // The "coding pattern" for computing max is:
        // 1. Set max to the first item
        // 2. Compare current max with the second item and update max if second item is bigger
        // 3. Repeat for the next item
        max = number1;

        if(number2 > max){
            max = number2;
        }
        if(number3 > max){
            max = number3;
        }
        // Print results
        System.out.print(" The sum of " + number1 + ", " + number2 + ", " + number3 + " is ");
        System.out.println(sum);
        System.out.print(" The product of " + number1 + ", " + number2 + ", "+ number3 + " is ");
        System.out.println(product);
        System.out.print(" The minimum of " + number1 + ", " + number2 + ", " + number3 + " is ");
        System.out.println(min);
        System.out.print(" The maximum of " + number1 + ", " + number2 + ", " + number3 + " is ");
        System.out.println(max);

    }

}
