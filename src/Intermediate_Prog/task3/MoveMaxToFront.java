package Intermediate_Prog.task3;

import java.util.Scanner;

public class MoveMaxToFront {

    static void main(String[] args) {
        // Labrador_KimLouise
        Scanner scanner = new Scanner(System.in);

        // input
        IO.print("input: ");
        String input = scanner.nextLine();
        char[] arr = input.toCharArray();

        char max = arr[0];
        int maxIndex = 0;

        // Find the max number
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        // move the max number to the front
        for (int i = maxIndex; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = max;

        // Output
        IO.println("Output: " + new String(arr));
    }
}
