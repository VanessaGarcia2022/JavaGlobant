package decisionAndLoop;

public class CozaLozaWoza {   // Save as "CozaLozaWoza.java"
    public static void main(String[] args) {
        boolean printed;
        final int LOWERBOUND = 1, UPPERBOUND = 110;
            for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
                // number = LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND
                printed = false; // flag for processed number
                // Print "Coza" if number is divisible by 3
                if ( number % 3 == 0 ) {
                    System.out.print("Coza");
                    printed = true;
                }
                if ( number % 5 == 0 ) { // Print "Loza" if number is divisible by 5
                    System.out.print("Loza");
                    printed = true;
                }
                if ( number % 7 == 0 ) { // Print "Woza" if number is divisible by 7
                    System.out.print("Woza");
                    printed = true;
                }
                // Print the number if it is not divisible by 3, 5 and 7 (i.e., it has not been processed above)
                // if (!(number % 3 == 0 || number % 5 == 0 || number % 7 == 0)) {

                if (!printed){ // Using the boolen flag
                    System.out.print(number);
                }
                // After processing the number, print a newline if number is divisible by 11;
                // else print a space
                if ( number % 11 == 0 ) {
                    System.out.println();  // print newline
                } else {
                System.out.print(" ");  // print a space
            }
        }
    }
}

