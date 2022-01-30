package gettingStarted;

/**
 * Try printing the sum of 31 times of number1 and 17 times of number2.
 * */
public class ProductAndSum {
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int result;

        //sum of 31 times of number1 and 17 times of number2.
        result = (31*number1) + ( 17*number2);

        System.out.println("The result of the sum of 31 times of " + number1 + " and 17 times of "
                + number2 + " is " + result);
    }
}
