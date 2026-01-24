package Intro_to_Prog;

import java.util.Scanner;

public class TASK04_ProblemStatement1_Labrador_Kim_Louise {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 5 numbers
        System.out.println("Enter five numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double num5 = scanner.nextDouble();

        // Compute average
        double sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5;

        // Output result
        System.out.println("The average is: " + average);

        scanner.close();
    }
}
