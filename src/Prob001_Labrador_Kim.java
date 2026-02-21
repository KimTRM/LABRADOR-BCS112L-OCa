import java.util.Scanner;

public class Prob001_Labrador_Kim {
    static void main() {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        IO.print("Input number of names: "); // Ask input
        int numNames = scanner.nextInt(); // Initialize variable and gets the input size

        String[] names = new String[numNames]; // Declare and initialize array

        for (int i = 0; i < names.length; i++) {
            IO.print("Input name: "); // Ask input
            names[i] = scanner.next(); // Gets the input names
        }

        IO.println("\nElement\tValues"); // Print header
        for (int i = 0; i < names.length; i++) {
            IO.println("   " + i + "\t" + names[i]); // Output the index and value
        }

        scanner.close(); // Close scanner
    }
}
