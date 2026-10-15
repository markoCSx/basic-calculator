package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Factors
        int number1;
        int number2;

        //User Factor Inputs
        System.out.print("Enter your first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        number2 = scanner.nextInt();

        //User Operation Input
        System.out.println("Choose one of the four basic arithmetic operations:");
        System.out.println(" -Add\n -Subtract\n -Multiply\n -Divide");
        System.out.print("Operation: ");
        scanner.nextLine(); //To eat the newline
        String operation = scanner.nextLine();

        //Calculation
        int product = number1 * number2;

        //Final Output
        System.out.printf("\nMath\n\n%d * %d = %d%n", number1, number2, product);
    }

}
