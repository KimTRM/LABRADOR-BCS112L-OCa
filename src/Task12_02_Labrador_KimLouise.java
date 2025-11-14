public class Task12_02_Labrador_KimLouise {
    static void main() {

        // Multiplication Table using While Loop
        IO.println("Multiplication Table using While Loop\n");

        int multiplicand1 = 1; // Initialize multiplicand starting from 1
        while (multiplicand1 <= 10) {
            int multiplictor1 = 1; // Initialize multiplier for each row

            // Calculate products for current row
            while (multiplictor1 <= 10) {
                int product = multiplicand1 * multiplictor1;
                IO.print(product + "\t");

                multiplictor1++;
            }

            // Move to next line after completing a row
            IO.println();
            multiplicand1++;
        }

        // Multiplication Table using Do While Loop
        IO.println("\nMultiplication Table using Do While Loop\n");

        int multiplicand2 = 1; // Initialize multiplicand starting from 1
        do {
            int multiplictor2 = 1;  // Initialize multiplier for each row

            // Calculate products for current row
            do {
                int product = multiplicand2 * multiplictor2;
                IO.print(product + "\t");
                
                multiplictor2++;
            } while (multiplictor2 <= 10);

            // Move to next line after completing a row
            IO.println();
            multiplicand2++;
        } while (multiplicand2 <= 10);

    }
}
