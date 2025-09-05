import java.util.Scanner;

public class TASK05_ProblemStatement1_Labrador_Kim_Louise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rate
        final double EXCHANGE_RATE = 57.15;

        // Ask the user for input in Peso
        System.out.print("Enter amount in PHP: ");
        double peso = scanner.nextDouble();

        // Convert Peso to USD
        double usd = peso / EXCHANGE_RATE;

        // Display result
        System.out.println("Equivalent in USD: " + usd);

        scanner.close();
    }
}
