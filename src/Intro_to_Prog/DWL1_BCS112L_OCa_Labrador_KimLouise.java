package Intro_to_Prog;

import java.util.Scanner;

public class DWL1_BCS112L_OCa_Labrador_KimLouise {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        // Prompt the user to enter an even number between 1 and 10
        do {
            System.out.print("Enter an even number between 1 and 10: ");
            number = input.nextInt();  // Read the next integer from input
        } while (number < 1 || number > 10 || number % 2 != 0);  // Repeat while number is out of range or not even

        // Output the validated even number
        System.out.println("Valid even number entered: " + number);

        input.close();
    }
}
