import java.util.Scanner;

public class No1_Labrador_KimLouise_MidtermExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level;
        String educationLevel;

        // Input Education Level
        System.out.print("Enter Education Level: ");

        if(scanner.hasNextInt()){
            level = scanner.nextInt();
        }
        else {
            System.out.println("Invalid Input");
            return;
        }

        // Check Education Level
        if (level >= 1 &&  level < 5)
            educationLevel = "Elementary School";
        else if (level >= 5 &&  level < 9)
            educationLevel = "Middle School";
        else if (level >= 9 && level < 13)
            educationLevel = "High School";
        else if (level > 12)
            educationLevel = "Collage";
        else
            educationLevel = "None";

        // Output Results of Education Level 
        System.out.println("Education Level: " + educationLevel);
    }
}
