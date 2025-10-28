import java.util.Scanner;

public class DWL2_BCS112L_OCa_Labrador_KimLouise {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        // Ask for Y or N and read input
        do {
            System.out.print("Enter 'Y' or 'N': ");
            choice = input.next().toUpperCase().charAt(0);
        } while (choice != 'Y' && choice != 'N'); // Repeat until input is Y or N

        // Output the validated choice
        System.out.println("You entered: " + choice);

        input.close();
    }
}
