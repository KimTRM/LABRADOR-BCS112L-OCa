import java.util.Scanner;

public class TASK08_Valid_Triangle_Labrador_KimLouise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the three sides of a triangle
        System.out.print("Enter side A: ");
        double sideA = input.nextDouble();

        System.out.print("Enter side B: ");
        double sideB = input.nextDouble();

        System.out.print("Enter side C: ");
        double sideC = input.nextDouble();

        // Check if the sides can form a valid triangle
        // The sum of any two sides must be greater than the third side
        boolean isValidTriangle = (sideA + sideB > sideC)
                && (sideA + sideC > sideB)
                && (sideB + sideC > sideA);

        // Display the result
        System.out.println("\n--- Triangle Validation Result ---");

        if (isValidTriangle)
            System.out.println("The sides form a VALID triangle.");
        else
            System.out.println("The sides CANNOT form a valid triangle.");

        input.close();
    }
}
