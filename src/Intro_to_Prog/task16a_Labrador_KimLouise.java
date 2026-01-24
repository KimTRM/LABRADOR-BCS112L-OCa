package Intro_to_Prog;

public class task16a_Labrador_KimLouise {
    static void main() {
        // Declare an array of integers and count how many times the number 5 appears in it
        int[] numbers = {1, 5, 2, 5, 3, 5, 4};
        int count = 0;

        // Loops through the array and counts occurrences of 5
        for (int number : numbers) {
            if (number == 5)
                count++;
        }

        // Prints the result
        IO.println("Number of times 5 appears: " + count);
    }
}
