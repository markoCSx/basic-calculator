package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Factors
        int number1;
        int number2;

        //User Inputs
        System.out.println("Enter your first number: ");
        number1 = scanner.nextInt();

        System.out.println("Enter your second number: ");
        number2 = scanner.nextInt();

        System.out.println("Choose one of the four basic arithmetic operations:");
        System.out.println(" -Add\n -Subtract\n -Multiply\n -Divide");
    }

}
