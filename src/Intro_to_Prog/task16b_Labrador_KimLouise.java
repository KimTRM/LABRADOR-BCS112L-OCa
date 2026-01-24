package Intro_to_Prog;

public class task16b_Labrador_KimLouise {
    static void main() {
        // Declare an array of integers and print its elements in reverse order
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = numbers.length - 1; i >= 0; i--) {
            IO.println(numbers[i]);
        }
    }
}
