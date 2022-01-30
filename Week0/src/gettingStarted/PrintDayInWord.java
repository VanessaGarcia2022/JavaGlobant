package gettingStarted;

public class PrintDayInWord {
    public static void main(String[] args) {
        int dayNumber = 9;

        // Using nested-if
        if (dayNumber == 1) {   // Use == for comparison
            System.out.println("Monday");
        } else if ( dayNumber == 2) {
            System.out.println( "Tuesday");
        } else if ( dayNumber == 3) {
            System.out.println( "Wednesday");
        }else if ( dayNumber == 4) {
            System.out.println("Thursday");
        }else if ( dayNumber == 5) {
            System.out.println("Friday");
        }else if ( dayNumber == 6) {
            System.out.println("Saturday");
        }else if ( dayNumber == 7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Not a valid day");
        }

        // Using switch-case-default
        switch(dayNumber) {
            case 1:
                System.out.println("Monday");
                ;
                break;  // Don't forget the "break" after each case!
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
