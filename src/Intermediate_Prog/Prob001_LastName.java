package Intermediate_Prog;

public class Prob001_LastName {  // Class declaration
    static void main(String[] args) {  // Main method

        String[] names = {"Tanya", "Mark", "Archris", "James", "Jake"}; // Declare and initialize array

        System.out.println("Element\tValues"); // Print header

        for (int i = 0; i < names.length; i++) { // Loop through array
            System.out.println(i + "\t" + names[i]); // Print index and value
        }
    }
}