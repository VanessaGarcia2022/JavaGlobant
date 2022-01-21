package decisionAndLoop;

/**
 * Tribonacci numbers are a sequence of numbers T(n) similar to Fibonacci numbers, except that a number is formed by
 * adding the three previous numbers.
 */
public class Tribonacci {
    public static void main(String[] args) {
        int n = 4;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
        int fn;             // F(n) to be computed
        int fnMinus1 = 0;   // F(n-1), init to F(3)
        int fnMinus2 = 1;   // F(n-2), init to F(2)
        int fnMinus3 = 1;   // F(n-3), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2 + fnMinus3;  // Need sum to compute average
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3 +" ");

        while (n <= nMax) {  // n starts from 3
            // n = 4, 5, 6, ..., nMax
            // Compute F(n), print it and add to sum
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            System.out.print(fn + " ");
            sum += fn;

            // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
        }
    }
}
