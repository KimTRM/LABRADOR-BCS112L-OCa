package Intro_to_Prog;

import java.util.Scanner;

public class Task09_Labrador_KimLouise_SwitchActivity {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("--- Simple Calculator ---\n");

        // Get user input for two numbers and an operator
        System.out.print("Enter first number: ");
        double num1 = ValidateDoubleInput(scanner);

        System.out.print("Enter second number: ");
        double num2 = ValidateDoubleInput(scanner);

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = ValidateOperatorInput(scanner);

        // Display the result of the calculation
        System.out.println("\n-- Result --\n" + num1 + " " + operator + " " + num2 + " = " + Calculate(num1, num2, operator));

        scanner.close();
    }

    /*
     * Validates and returns a double input from the user.
     * Recursively prompts until a valid double is entered.
     */
    private static double ValidateDoubleInput(Scanner scanner) {
        double number;

        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next(); // Clear the invalid input
            number = ValidateDoubleInput(scanner); // Recursively call to get valid input
        }

        return number;
    }

    /*
     * Validates and returns an operator input from the user.
     * Recursively prompts until a valid operator (+, -, *, /) is entered.
     */
    private static char ValidateOperatorInput(Scanner scanner) {
        char operator;

        operator = scanner.next().charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/')
            return operator;
        else {
            System.out.print("Invalid operator. Please enter a valid operator (+, -, *, /): ");
            operator = ValidateOperatorInput(scanner); // Recursively call to get valid input
        }

        return operator;
    }

    /**
     * Performs calculation based on the provided numbers and operator.
     * Handles division by zero and invalid operators
     */
    private static double Calculate(double num1, double num2, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero");
                    return Double.NaN; // Return NaN for division by zero
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return Double.NaN; // Return NaN for invalid operator
        }

        return result;
    }
}
