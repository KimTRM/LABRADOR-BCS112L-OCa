package Intro_to_Prog;

import java.util.Scanner;

/*
    name: Kim Louise T. Labrador
    date: 12/12/2025
    title: Reverse a Number
    description: Develop a Java Program that reverses a given number.
 */
public class A1_Labrador_KimLouise {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks for the input
        System.out.print("Input numbers: ");
        String input = scanner.nextLine();

        // converts to char array
        char[] numbers = input.toCharArray();

        // Reverses the input and prints it
        System.out.print("Reverse number is ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
    }
}