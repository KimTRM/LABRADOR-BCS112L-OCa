import java.util.Scanner;

public class Task13_Labrador_KimLouise {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Get password input
            IO.print("\nEnter your password: ");
            String password = scanner.nextLine();

            int upper = 0;
            int lower = 0;
            int digits = 0;
            int special = 0;

            // Count character types
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch))
                    upper++;
                else if (Character.isLowerCase(ch))
                    lower++;
                else if (Character.isDigit(ch))
                    digits++;
                else
                    special++;
            }

            // Check password strength
            boolean hasUpper = upper > 0;
            boolean hasLower = lower > 0;
            boolean hasDigit = digits > 0;
            boolean hasSpecial = special > 0;

            int length = password.length();

            String strength;

            int typeCount = 0;
            if (hasUpper) typeCount++;
            if (hasLower) typeCount++;
            if (hasDigit) typeCount++;
            if (hasSpecial) typeCount++;

            if (length >= 10 && hasUpper && hasLower && hasDigit && hasSpecial)
                strength = "Strong";
            else if (length >= 6 && length <= 9 || typeCount >= 2)
                strength = "Moderate";
            else
                strength = "Weak";

            // Display results
            IO.println("\n--- Password Analysis ---");
            IO.println("Uppercase Letters : " + upper);
            IO.println("Lowercase Letters : " + lower);
            IO.println("Digits            : " + digits);
            IO.println("Special Characters: " + special);
            IO.println("\nPassword Strength: " + strength);

            // Ask the user if they want to try again
            IO.print("\nDo you want to try again: (Y/N): ");
            choice = scanner.nextLine().toUpperCase().charAt(0);
        } while (choice == 'Y');

        // Thanks the user for using the program
        IO.println("\nThank you for using the Password Strength Checker Program.");

        scanner.close();
    }
}
