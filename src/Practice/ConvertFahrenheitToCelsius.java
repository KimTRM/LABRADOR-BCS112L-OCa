package Practice;

import java.util.Scanner;

public class ConvertFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("The temperature in Celsius is: %.2f°C%n", celsius);

        scanner.close();
    }
}
