package Data_Structures_and_Algorithms.Activity4;

import java.util.Arrays;
import java.util.Scanner;

public class Prob002_Labrador_Kim {
    static void main() {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        int[] scores = new int[5]; // Store scores

        for (int i = 0; i < scores.length; i++) {
            IO.print("Input score " + (i + 1) + ": "); // Ask input
            scores[i] = scanner.nextInt(); // Gets input scores
        }

        Arrays.sort(scores); // Sort in ascending order

        IO.println("\nTop 10 Scores (Descending):"); // Header
        for (int i = scores.length - 1; i >= 0; i--) { // Loop backwards for descending
            IO.println("Top " + (i + 1) + ": " + scores[i]); // Print score
        }

        scanner.close(); // Close scanner
    }
}
