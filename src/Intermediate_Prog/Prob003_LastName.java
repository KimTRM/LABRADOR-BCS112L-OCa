package Intermediate_Prog;

import java.util.Scanner; // Import Scanner

public class Prob003_LastName { // Class declaration
    static void main(String[] args) { // Main method

        Scanner sc = new Scanner(System.in); // Create Scanner object
        int[] scores = new int[30]; // Create array for 30 students
        int sum = 0; // Variable to store total

        for (int i = 0; i < scores.length; i++) { // Loop for input
            System.out.print("Student " + (i + 1) + ": "); // Ask input
            scores[i] = sc.nextInt(); // Store score
            sum += scores[i]; // Add to total
        }

        double average = (double) sum / scores.length; // Compute average

        System.out.println("Sum of Scores: " + sum); // Print sum
        System.out.println("Average: " + average); // Print average

        sc.close(); // Close scanner
    }
}
