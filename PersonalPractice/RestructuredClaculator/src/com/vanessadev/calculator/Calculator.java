package com.vanessadev.calculator;

import java.util.Scanner;

public class Calculator {
    public float operationSum(float num1, float num2) {
        return num1 + num2;
    }
    public float operationSub(float num1, float num2) {
        return num1 - num2;
    }
    public float operationProduct(float num1, float num2) {
        return num1 * num2;
    }
    public float operationDivision(float num1, float num2) {
        return num1/num2;
    }
    public void menu(){
        System.out.println("Select the operation");
        System.out.println("1. Sum");
        System.out.println("2. Subtraction");
        System.out.println("3. Product");
        System.out.println("4. Division");
    }

    public float getNumber () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextFloat();
    }
    public float computeOperation (int option, float num1, float num2){
        switch (option){
            case 1: //sum
                return operationSum(num1, num2);
             case 2: //sub
                return operationSub(num1, num2);
            case 3: //product
                return operationProduct(num1, num2);
            case 4: //division
                if (num2 == 0){
                    return -1;
                }else {
                    return operationDivision(num1, num2);
                }
            default :
                return -1;
        }

    }
}
