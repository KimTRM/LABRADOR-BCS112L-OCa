import java.util.Scanner;

public class Task12_01_Labrador_KimLouise {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Ask the user to enter the starting and ending numbers to calculate
            IO.print("\nEnter starting number: ");
            int start = scanner.nextInt();

            IO.print("Enter ending number: ");
            int end = scanner.nextInt();

            // Outputs the even numbers
            IO.println("\nEven numbers between " + start + " and " + end + ":");
            int evenCount = start; // Store original start value for even number calculation
            int evenTotal = 0;
            while (evenCount <= end) {
                if (evenCount % 2 == 0) {
                    IO.print(evenCount + " ");
                    evenTotal++;
                }
                evenCount++;
            }

            // Outputs the odd numbers
            IO.println("\n\nOdd numbers between " + start + " and " + end + ":");
            int oddCount = start; // Store original start value for odd number calculation
            int oddTotal = 0;
            while (oddCount <= end) {
                if (oddCount % 2 != 0) {
                    IO.print(oddCount + " ");
                    oddTotal++;
                }
                oddCount++;
            }

            // Outputs the total number of even numbers
            IO.println("\n\nTotal even numbers: " + evenTotal);

            // Outputs the total number of odd numbers
            IO.println("Total odd numbers: " + oddTotal);

            // Ask the user if they want to try again
            IO.print("\nDo you want to try again: (Y/N): ");
            choice = scanner.next().toUpperCase().charAt(0);
        } while (choice == 'Y');

        // Thanks the user for using the program
        IO.println("\nThank you for using the program!");
        scanner.close();
    }
}
