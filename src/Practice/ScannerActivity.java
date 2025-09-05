package Practice;

import java.util.Scanner;

public class ScannerActivity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter a the Name of the Student: ");
        name = scanner.nextLine();

        System.out.print("Enter a the Age of the Student: ");
        age = scanner.nextInt();

        System.out.print("Enter the Monthly Allowance of the Student: ");
        double allowance = scanner.nextDouble();

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

        if (age >= 18)
            System.out.println(name + " is an adult.");
        else
            System.out.println(name + " is still a minor.");

        System.out.println("Student Monthly Allowance: " + allowance);

        scanner.close();
    }
}
