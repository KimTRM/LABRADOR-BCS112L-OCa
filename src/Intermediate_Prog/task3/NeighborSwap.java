package Intermediate_Prog.task3;

import java.util.Scanner;

public class NeighborSwap {
    static void main(String[] args) {
        // Labrador_KimLouise
        Scanner scanner = new Scanner(System.in);

        // input
        IO.print("input: ");
        String input = scanner.nextLine();
        char[] arr = input.toCharArray();

        // Swap to Neighbor
        for (int i = 0; i < arr.length - 1; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Output
        IO.print("output: " + new String(arr));
    }

}
