package gettingStarted;

/**
 *  program to sum all the running integers from 1 and 1000, that are divisible by 3, 5 or 7, but NOT by 15, 21,
 *  35 or 105.
 */

public class ThreeFiveSevenSum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0;
        int num = LOWERBOUND;

        while (num <= UPPERBOUND) {

            // divisible by 3, 5 or 7 but NOT by 15, 21, 35 or 105.
            if ((num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0) &&
                    !((num % 15 == 0) || (num % 21 == 0) || (num % 105 == 0))) {
                sum += num;
                //System.out.print(num + ", ");
            }
            num++;
        }

        System.out.println("the sum is: " + sum);

    }
}
