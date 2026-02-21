package Data_Structures_and_Algorithms.Activity4;

import java.util.Scanner;

public class Prob004_Labrador_Kim {
    static void main() {
        Scanner scanner = new Scanner(System.in); // Create Scanner
        double[] temps = new double[5]; // Array for 5 sensors
        double sum = 0; // Variable to store total

        for (int i = 0; i < temps.length; i++) { // Loop for input
            IO.print("Enter temperature for Sensor " + (i + 1) + ": "); // Ask input
            temps[i] = scanner.nextDouble(); // Store temperature
            sum += temps[i]; // Add to total

            if (temps[i] > 28.0) { // Check if above 28
                IO.println("Warning: Sensor " + (i + 1) + " is above 28°C!"); // Print warning
            }
            IO.println(); // Print empty line
        }

        double average = sum / temps.length; // Compute average

        IO.println("Average Temperature: " + average); // Print average

        scanner.close(); // Close scanner
    }
}
