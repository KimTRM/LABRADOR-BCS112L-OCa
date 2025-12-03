public class task15a_Labrador_KimLouise {
    static void main() {

        // prints numbers 1-15, excluding multiples of 3.
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0)
                continue;

            IO.println(i);
        }
    }
}
