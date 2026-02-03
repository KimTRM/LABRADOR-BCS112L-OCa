import java.util.Scanner;

public class ShoppingCartSystem {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        IO.println("--- Shopping Cart System ---");
        // Input number of items
        IO.print("Enter the number of items to add to the cart: ");
        int itemCount = scanner.nextInt();

        double[] itemPrices = new double[itemCount];
        for (int i = 0; i < itemCount; i++) {
            // Input price for each item
            IO.print("Enter price for item " + (i + 1) + ": ");
            itemPrices[i] = scanner.nextInt();

            // Apply discount if price > 100
            if (itemPrices[i] > 100) {
                double discount = itemPrices[i] * .1;
                itemPrices[i] = itemPrices[i] - discount;
            }
        }

        // Find the most expensive item after discount
        double mostExpensive = itemPrices[0];
        for (double price : itemPrices) {
            if (price > mostExpensive) {
                mostExpensive = price;
            }
        }

        // Output results
        IO.println("--- Results ---");
        for (double price : itemPrices)
            IO.println("Item price after discount (if applicable): " + price);

        IO.println("Most expensive item price after discount: " + mostExpensive);

        scanner.close();
    }
}
