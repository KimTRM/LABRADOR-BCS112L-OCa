package Intermediate_Prog.task2;

import java.util.Scanner;
import java.util.Arrays;

public class EvenandOddSplit {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        IO.println("--- Even and Odd Split ---");
        IO.print("Enter the number of integers: ");
        int indexSize = scanner.nextInt();

        int[] numbers = new int[indexSize];
        int[] evenNumbers = new int[indexSize];
        int[] oddNumbers = new int[indexSize];

        // Input integers and split into even and odd arrays
        IO.println("Enter " + indexSize + " integers:");
        for (int i = 0; i < indexSize; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 == 0)
                evenNumbers[i] = numbers[i];
            else
                oddNumbers[i] = numbers[i];
        }

        // Output results
        IO.println("--- Results ---");
        IO.println("Original array: " + Arrays.toString(numbers));

        IO.print("Even numbers: ");
        for (int num : evenNumbers)
            if (num != 0) IO.print(num + " ");

        IO.println("Odd numbers: ");
        for (int num : oddNumbers)
            if (num != 0) IO.print(num + " ");

        scanner.close();
    }
}
