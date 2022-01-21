package com.vanessadev.principal;
import java.util.Scanner;
import com.vanessadev.calculator.Calculator;


public class Principal {
    public static void main(String[] args) {
        // welcome
        System.out.println("+--------------------+");
        System.out.println("|---- Calculator ----|");
        System.out.println("+--------------------+");

        // declare variables
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator(); // instance of calculator
        float num1;
        float num2;
        float result;
        int option;

        // prompt user for two integers
        num1 = cal.getNumber();
        num2 = cal.getNumber();

        // show the menu
        cal.menu();

        // get the option
        option = sc.nextInt();

        // compute the operation
        result = cal.computeOperation(option, num1, num2);

        // print the result
        if (result == -1){
            System.out.println("The operation could not be executed");
        }else{
            System.out.println("the result is: " + result);
        }






    }
}
