package Data_Structures_and_Algorithms.Activity1;

import java.util.Scanner;

public class ComputeArray {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        IO.println("--- Array Computation ---");
        IO.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            IO.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int difference = 0;
        int product = 1;
        double quotient = 1.0;
        for (int num : numbers) {
            sum += num;
            difference -= num;
            product *= num;
            quotient /= num;
        }

        IO.println("\n--- Computation Results ---");
        IO.println("The sum of the array elements is: " + sum);
        IO.println("The difference of the array elements is: " + difference);
        IO.println("The product of the array elements is: " + product);
        IO.println("The quotient of the array elements is: " + quotient);

        scanner.close();
    }
}
