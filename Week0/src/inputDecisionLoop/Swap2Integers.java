package inputDecisionLoop;
import java.util.Scanner;

/**
 * 1. Prompt user for two integers
 * 2. Read inputs as "int"
 * 3. swap the contents of the two variables
 * 4. print the results.
 */
public class Swap2Integers {
    public static void main(String[] args) {
        // Declare variables
        int number1, number2, tmp;

        // prompts user for two integers.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();
        in.close();

        // Swap the values
        tmp = number1;
        number1 = number2;
        number2 = tmp;

        // print the result
        System.out.println("After the swap, first integer is: " + number1 +", second integer is: " + number2);

    }
}
