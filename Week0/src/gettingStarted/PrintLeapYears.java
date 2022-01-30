package gettingStarted;

/**
 *  program to print all the leap years between AD999 and AD2010. Also print the total number of leap years.
 */

public class PrintLeapYears {
    public static void main(String[] args) {
        final int LOWERBOUND = 999;
        final int UPPERBOUND = 2010;
        int year = LOWERBOUND;
        int totalLeapYears = 0;

        // leep year divisible by both 4 and 400
        while (year <= UPPERBOUND) {
            if ((year % 4 == 0) && (!(year % 100 == 0) || year % 400 == 0)) {
                System.out.println("leap year: " + year);
                totalLeapYears++;
            }
            year++;
        }
        System.out.println("Total of leep years: " + totalLeapYears);

    }
}
