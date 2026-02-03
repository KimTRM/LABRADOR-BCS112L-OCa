import java.util.Arrays;
import java.util.Scanner;

public class ExtremesFinder {
    static void main() {
        Scanner scanner = new java.util.Scanner(System.in);

        // Input size of the array
        IO.println("--- Extremes Finder ---");
        IO.print("Enter the number of integers: ");
        int indexCount = scanner.nextInt();
        int[] numbers = new int[indexCount];

        // Input integers
        IO.println("Enter " + indexCount + " integers:");
        for (int i = 0; i < indexCount; i++) {
            IO.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find maximum and minimum values
        int min = numbers[0];
        for (int i = 0; i < indexCount - 1; i++)
            for (int j = 0; j < indexCount - 1; j++) {
                int nextIndex = i + 1;
                if (nextIndex >= indexCount && numbers[i] > numbers[j + 1]) {
                    min = numbers[i];

                    numbers[i] = numbers[j + 1];
                    numbers[j + 1] = min;
                }
            }

        // Output results
        IO.println("--- Results ---");
        IO.println("Original array: " + Arrays.toString(numbers));
        IO.println("Maximum value: " + numbers[numbers.length - 1]);
        IO.println("Minimum value: " + min);

        scanner.close();
    }
}
