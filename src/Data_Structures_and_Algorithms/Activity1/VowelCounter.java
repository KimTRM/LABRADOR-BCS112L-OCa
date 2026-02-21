package Data_Structures_and_Algorithms.Activity1;

import java.util.Scanner;

public class VowelCounter {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        IO.println("--- Vowel Counter ---");
        IO.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);

        IO.println("The Number of vowels in the string: " + vowelCount);

        scanner.close();
    }

    static int countVowels(String input) {
        int vowelCount = 0;
        for (char c : input.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1)
                vowelCount++;
        return vowelCount;
    }
}
