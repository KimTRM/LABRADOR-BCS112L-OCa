package Intermediate_Prog;

import java.util.Arrays; // Import Arrays class

public class Prob002_LastName { // Class declaration
    static void main(String[] args) { // Main method

        int[] scores = {85, 92, 78, 60, 88, 95, 70, 99, 65, 90}; // Store scores

        Arrays.sort(scores); // Sort in ascending order

        System.out.println("Top 10 Scores (Descending):"); // Header

        for (int i = scores.length - 1; i >= 0; i--) { // Loop backwards for descending
            System.out.println(scores[i]); // Print score
        }
    }
}
