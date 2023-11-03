package Lecture3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumber = scanner.nextFloat();


        System.out.print("Enter the second number: ");
        float secondNumber = scanner.nextFloat();


        float sum = firstNumber + secondNumber;
        float difference = firstNumber - secondNumber;
        float product = firstNumber * secondNumber;

        float quotient;
        if (secondNumber != 0) {
            quotient = firstNumber / secondNumber;
        } else {
            System.out.println("Undefined (division by zero)");

            scanner.close();
            return; // exit the program
        }


        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);
        System.out.println("Quotient: " + quotient);


        scanner.close();
    }
}

