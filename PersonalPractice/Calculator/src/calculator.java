import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;
        float result;
        int option;

        System.out.print("Enter the first number: ");
        num1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        num2 = sc.nextFloat();
        //sc.close();

        System.out.println("Select the operation");
        System.out.println("1. Sum");
        System.out.println("2. Subtraction");
        System.out.println("3. Product");
        System.out.println("4. Division");

        option = sc.nextInt();
        sc.close();
        //System.out.println(option);
        switch (option){
            case 1: // suma
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;
            case 2: // sub
                result = num1 - num2;
                System.out.println("The Subtraction is: " + result);
                break;
            case 3: // product
                result = num1 * num2;
                System.out.println("The Product is: " + result);
                break;
            case 4: // division
                if (num2 == 0){
                    System.out.println("Cannot be divided by 0 \nPlease try again");
                }else {
                    result = num1 / num2;
                    System.out.println("The Division is: " + result);
                }
                break;

            default :
                System.out.println("Select a available option: 1, 2, 3 or 4");

        }
    }
}
