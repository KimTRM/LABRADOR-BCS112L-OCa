public class Task12_02_Labrador_KimLouise {
    static void main() {

        // Multiplication Table using While Loop
        IO.println("Multiplication Table using While Loop\n");
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                IO.print(i * j + "\t");
                j++;
            }
            IO.println();
            i++;
        }

        // Multiplication Table using Do While Loop
        IO.println("\nMultiplication Table using Do While Loop\n");
        int m = 1;
        do {
            int n = 1;
            do {
                IO.print(m * n + "\t");
                n++;
            } while (n <= 10);
            IO.println();
            m++;
        } while (m <= 10);

    }
}
