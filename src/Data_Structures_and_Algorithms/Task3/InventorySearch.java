package Data_Structures_and_Algorithms.Task3;

import java.util.Scanner;

public class InventorySearch {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for product ID to search
        IO.println("Enter product ID to search:");
        int target = scanner.nextInt();

        // Simulated product stock with product IDs
        int[] productStock = {101, 202, 303, 404, 505};
        boolean found = false;

        // Search for the target product
        for (int id : productStock) {
            if (id == target) {
                found = true;
                break;
            }
        }

        // Output result
        if (found)
            IO.println("Product is in stock.");
        else
            IO.println("Product out of stock.");
    }
}
