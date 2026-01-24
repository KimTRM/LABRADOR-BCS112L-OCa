package Intro_to_Prog;

import java.util.Scanner;

public class Task14_Labrador_KimLouise {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double[] sales = new double[7];
        double total = 0;

        System.out.println("------ WEEKLY SALES TRACKING SYSTEM ------\n");

        // INPUT LOOP (with validation)
        for (int i = 0; i < 7; i++) {
            while (true) {
                System.out.print("Enter sales for Day " + (i + 1) + ": ");
                double amount = scanner.nextDouble();

                if (amount < 0) {
                    System.out.println("Invalid input. Sales cannot be negative.");
                } else {
                    sales[i] = amount;
                    break; // exit while loop when valid
                }
            }
        }

        // CALCULATIONS
        double highest = sales[0];
        double lowest = sales[0];
        int highestDay = 1;
        int lowestDay = 1;

        for (int i = 0; i < sales.length; i++) {
            total += sales[i];

            if (sales[i] > highest) {
                highest = sales[i];
                highestDay = i + 1;
            }

            if (sales[i] < lowest) {
                lowest = sales[i];
                lowestDay = i + 1;
            }
        }

        double average = total / 7;

        // OUTPUT: DAILY SALES
        System.out.println("\n------ DAILY SALES LIST ------");
        for (int i = 0; i < 7; i++) {
            System.out.printf("Day %d Sales: ₱%.2f%n", (i + 1), sales[i]);
        }

        // OUTPUT: SUMMARY
        System.out.println("\n------ WEEKLY SALES SUMMARY ------");
        System.out.printf("Total Sales: ₱%.2f%n", total);
        System.out.printf("Average Daily Sales: ₱%.2f%n", average);
        System.out.printf("Highest Sales: ₱%.2f (Day %d)%n", highest, highestDay);
        System.out.printf("Lowest Sales:  ₱%.2f (Day %d)%n", lowest, lowestDay);

        scanner.close();
    }
}
