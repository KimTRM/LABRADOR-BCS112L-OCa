package Intro_to_Prog;

import java.util.Scanner;

/*
    name: Kim Louise T. Labrador
    date: 12/12/2025
    title: Water Consumption Monitoring System
    description: A Water District needs a simple Java program to help track household water consumption for a billing review
 */
public class B1_Labrador_KimLouise {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks the User for the Max Household Count
        System.out.print("Enter How Many Households will be Recorded (max of 20): ");
        int maxHouseholdCount = scanner.nextInt();

        if (maxHouseholdCount > 20) {
            System.out.println("Max Households Should not exceed 20, Please try Again");
            System.out.println("\nEnter How Many Households will be Recorded (max of 20): ");
            maxHouseholdCount = scanner.nextInt();
        }

        scanner.nextLine();

        String[] householdOwnerName = new String[maxHouseholdCount];
        double[] previousMeterReading = new double[maxHouseholdCount];
        double[] currentMeterReading = new double[maxHouseholdCount];
        double[] waterConsumptions = new double[maxHouseholdCount];
        double totalWaterConsumption = 0;

        for (int i = 0; i < maxHouseholdCount; i++) {
            // Asks the User for Household Owner Name
            System.out.print("\nEnter Household Owner Name: ");
            householdOwnerName[i] = scanner.nextLine();

            // Asks the User for Previous Meter Reading
            System.out.print("Enter Previous Meter Reading: ");
            previousMeterReading[i] = scanner.nextDouble();

            // Asks the User for Previous Meter Reading

            while (true) {
                System.out.print("Enter Current Meter Reading: ");
                currentMeterReading[i] = scanner.nextDouble();

                if (currentMeterReading[i] < previousMeterReading[i]) {
                    System.out.println("Current Meter must be Greater than " + previousMeterReading[i]);
                    System.out.print("Enter Current Meter Reading: ");
                    currentMeterReading[i] = scanner.nextDouble();
                }
                break;
            }


            // Calculates Water Consumption
            waterConsumptions[i] = currentMeterReading[i] - previousMeterReading[i];

            scanner.nextLine();
        }

        for (int i = 0; i < maxHouseholdCount; i++) {
            System.out.println("\nHousehold Owner Name: " + householdOwnerName[i]);
            System.out.println("Water Consumption: " + waterConsumptions[i]);

            // Calculates Total Water Consumption
            totalWaterConsumption += waterConsumptions[i];
        }


        System.out.println("\nTotal Water Consumption: " + totalWaterConsumption);

        // Sorts the Water Consumption and Household Owner Name from lowest to highest based on the Water Consumption
        String highestHousehold;
        double highestWaterConsumption;
        for (int i = 0; i < maxHouseholdCount - 1; i++) {
            for (int j = 0; j < maxHouseholdCount - 1; j++) {

                int nextIndex = j + 1;
                if (nextIndex <= maxHouseholdCount) {
                    if (waterConsumptions[i] > waterConsumptions[j + 1]) {
                        highestWaterConsumption = waterConsumptions[i];
                        highestHousehold = householdOwnerName[i];

                        waterConsumptions[i] = waterConsumptions[j + 1];
                        waterConsumptions[j + 1] = highestWaterConsumption;

                        householdOwnerName[i] = householdOwnerName[j + 1];
                        householdOwnerName[j + 1] = highestHousehold;
                    }
                }
            }
        }

        // Prints the results
        System.out.println("\nHousehold with Highest Water Consumption: ");
        System.out.println("\tHousehold Owner Name: " + householdOwnerName[maxHouseholdCount - 1]);
        System.out.println("\tWater Consumption: " + waterConsumptions[maxHouseholdCount - 1]);

        System.out.println("\nHousehold with Lowest Water Consumption: ");
        System.out.println("\tHousehold Owner Name: " + householdOwnerName[0]);
        System.out.println("\tWater Consumption: " + waterConsumptions[0]);
    }
}
