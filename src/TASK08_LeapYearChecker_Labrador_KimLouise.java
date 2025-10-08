import java.util.Scanner;

public class TASK08_LeapYearChecker_Labrador_KimLouise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // A year is a leap year if:
        // (Divisible by 4 AND not divisible by 100) OR divisible by 400
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display result
        System.out.println("\n--- Leap Year Checker Result ---");

        if (isLeap)
            System.out.println(year + " is a Leap Year!");
        else
            System.out.println(year + " is NOT a Leap Year.");

        input.close();
    }
}