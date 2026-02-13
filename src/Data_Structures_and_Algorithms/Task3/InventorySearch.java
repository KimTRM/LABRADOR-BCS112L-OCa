package Data_Structures_and_Algorithms.Task3;

public class InventorySearch {
    static void main(String[] args) {
        // Simulated product stock with product IDs
        int[] productStock = {101, 202, 303, 404, 505};
        int target = 303;
        boolean found = false;

        // Search for the target product
        for (int id : productStock) {
            if (id == target) {
                found = true;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Product is in stock.");
        } else {
            System.out.println("Product out of stock.");
        }
    }
}
