import java.util.Scanner;

public class WL2_3007_Labrador_KimLouise {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Input a positive integer
        IO.print("Enter a positive integer: ");
        int num = input.nextInt();
        int sum = 0;
        int counter = 1;

        // Loop to add numbers from 1 to num
        while (counter <= num) {
            sum += counter;
            counter++;
        }

        // Output the result
        IO.println("Sum of Numbers is " + sum);

        input.close();
    }
}
