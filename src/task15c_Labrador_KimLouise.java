public class task15c_Labrador_KimLouise {
    static void main() {

        // Simulates adding items to a shopping cart until it reaches its limit of 12 items.
        for (int i = 1; i <= 20; i++) {
            if (i == 12)
                break;
        }

        // Prints message when cart is full.
        IO.println("Cart is full, processing checkout.");
    }
}
