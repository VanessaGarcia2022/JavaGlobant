package decisionAndLoop;

/**
 * program to extract each digit from an int, in the reverse order. For example,
 * if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.
 */

public class ExtractDigits {
    public static void main(String[] args) {
        // int num = 15423; original number
        int n = 15423; // number to destroy
        int digit;

        while (n > 0) {
            System.out.print("The last digit of " + n);
            digit = n % 10;
            System.out.println( " is " + digit);
            n = n/10;
        }
    }
}
