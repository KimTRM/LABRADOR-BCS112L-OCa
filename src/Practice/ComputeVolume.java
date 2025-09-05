package Practice;

import java.util.Scanner;

public class ComputeVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mass, density, volume;

        System.out.print("Enter the mass of the object (in kg): ");
        mass = scanner.nextDouble();

        System.out.print("Enter the density of the object (in kg/m^3): ");
        density = scanner.nextDouble();

        volume = mass / density;

        System.out.println("The volume of the object is " + volume + " m^3.");

        scanner.close();
    }
}
