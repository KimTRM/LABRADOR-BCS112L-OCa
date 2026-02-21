package Intermediate_Prog;

import java.util.Scanner; // Import Scanner

public class Prob004_LastName { // Class declaration
    static void main(String[] args) { // Main method

        Scanner sc = new Scanner(System.in); // Create Scanner
        double[] temps = new double[5]; // Array for 5 sensors
        double sum = 0; // Variable to store total

        for (int i = 0; i < temps.length; i++) { // Loop for input
            System.out.print("Enter temperature for Sensor " + (i + 1) + ": "); // Ask input
            temps[i] = sc.nextDouble(); // Store temperature
            sum += temps[i]; // Add to total

            if (temps[i] > 28.0) { // Check if above 28
                System.out.println("Warning: Sensor " + (i + 1) + " is above 28°C!"); // Print warning
            }
        }

        double average = sum / temps.length; // Compute average

        System.out.println("Average Temperature: " + average); // Print average

        sc.close(); // Close scanner
    }
}
