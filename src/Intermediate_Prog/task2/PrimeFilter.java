package Intermediate_Prog.task2;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeFilter {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("--- Prime Number Filter ---");

        // Input size of the array
        IO.print("Enter the number of integers: ");
        int indexSize = scanner.nextInt();

        int[] originalNumbers = new int[indexSize];
        int[] modifiedNumbers = new int[indexSize];

        IO.println("Enter " + indexSize + " integers:");
        for (int i = 0; i < indexSize; i++) {
            // Input each number
            IO.println("Number " + (i + 1) + ": ");
            originalNumbers[i] = scanner.nextInt();

            // Check if prime and modify accordingly
            if (isPrime(originalNumbers[i]))
                modifiedNumbers[i] = originalNumbers[i];
            else
                modifiedNumbers[i] = 0;
        }

        // Output results
        IO.println("--- Results ---");
        IO.println("Original array: " + Arrays.toString(originalNumbers));
        IO.println("Modified array (non-primes replaced with 0): " + Arrays.toString(modifiedNumbers));

        scanner.close();
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num == 1) return true;
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
