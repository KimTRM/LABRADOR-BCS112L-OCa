package Intro_to_Prog;

import java.util.Scanner;

public class TASK05_ProblemStatement2_Labrador_Kim_Louise {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion rate
        final double MILES_PER_KILOMETER = 0.6214;

        // Ask the user for distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert to miles
        double miles = kilometers * MILES_PER_KILOMETER;

        // Display result
        System.out.println("Equivalent in miles: " + miles);

        scanner.close();
    }
}
