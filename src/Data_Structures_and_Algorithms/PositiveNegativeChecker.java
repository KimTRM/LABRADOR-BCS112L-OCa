package Data_Structures_and_Algorithms;

import java.util.Scanner;

public class PositiveNegativeChecker {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        IO.println("--- Positive/Negative Number Checker ---");
        IO.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0)
            IO.println("The number " + number + " is Positive.");
        else if (number < 0)
            IO.println("The number " + number + " is Negative.");
        else
            IO.println("The number is Zero.");

        scanner.close();
    }
}
