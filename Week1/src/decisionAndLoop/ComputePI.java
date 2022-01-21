package decisionAndLoop;

/**
 * rogram called ComputePI to compute the value of π, using the following series expansion. Use the maximum denominator
 * (MAX_DENOMINATOR) as the terminating condition. Try MAX_DENOMINATOR of 1000, 10000, 100000, 1000000 and compare the
 * PI obtained.
 */
public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        double denominator, PI;
        int MAX_DENOMINATOR = 100;   // Try 10000, 100000, 1000000
        for (denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
            if (denominator % 4 == 1) {
                sum += 1/denominator;
                //System.out.println("SUM: denominator = " +denominator + "\n suma" + sum);
            } else if (denominator % 4 == 3) {
                sum -= 1/denominator;
                //System.out.println("SUB: denominator = " +denominator+ "\n suma" + (1/denominator));
            } else {   // remainder of 0 or 2
                System.out.println("Impossible!!!");
            }
        }
        PI = 4*sum;
        System.out.println("PI: " + PI);

    }
}
