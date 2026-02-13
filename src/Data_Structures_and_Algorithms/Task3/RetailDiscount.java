package Data_Structures_and_Algorithms.Task3;

public class RetailDiscount {
    static void main(String[] args) {
        // Simulated original prices of products
        double[] originalPrices = {50.0, 120.0, 80.0, 45.0};

        // Calculate and display discounted prices
        IO.println("Discounted Prices:");
        for (double price : originalPrices) {
            double discountedPrice = price * 0.9;
            IO.println(discountedPrice);
        }

        // Display original prices for comparison
        IO.println("\nOriginal Prices:");
        for (double price : originalPrices) {
            IO.println(price);
        }
    }
}
