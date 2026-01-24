package Intro_to_Prog;

public class task15b_Labrador_KimLouise {
    static void main() {

        // Loops through the string "programming" then prints only the vowels encountered.
        String str = "programming";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) == -1)
                continue;

            IO.println(ch);
        }
    }
}
