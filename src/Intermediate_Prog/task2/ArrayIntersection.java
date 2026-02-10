package Intermediate_Prog.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIntersection {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Input sizes of the two arrays
        IO.println("--- Array Intersection ---");
        IO.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        IO.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        ArrayList<Integer> intersection = new ArrayList<>();

        // Input elements for the first array
        IO.println("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            IO.println("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Input elements for the second array
        IO.println("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            IO.println("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Find intersection
        IO.println("Elements present in both arrays:");
        for (int num1 : array1)
            for (int num2 : array2)
                if (num1 == num2)
                    intersection.add(num1);

        // Output intersection elements
        for (int num : intersection) {
            IO.println(num);
        }

        scanner.close();
    }
}
