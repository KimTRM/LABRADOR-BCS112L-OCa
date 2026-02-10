package Intermediate_Prog.task3;

import java.util.Scanner;

public class RowColumnProduct {

    static void main(String[] args) {
        // Labrador_KimLouise

        Scanner scanner = new Scanner(System.in);

        // Input num of rows & cols
        IO.print("input number of rows: ");
        int numRows = scanner.nextInt();
        IO.print("input number of columns: ");
        int numCol = scanner.nextInt();
        IO.println();

        // Input values of the matrix
        int[][] matrix = new int[numRows][numCol];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCol; j++) {
                IO.print("input value of column " + (i + 1) + " row " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Get the Product of the Rows then Outputs the Results
        for (int i = 0; i < numRows; i++) {
            int rowProduct = 1;
            for (int j = 0; j < numCol; j++) {
                rowProduct *= matrix[i][j];
            }
            IO.println("Product of row " + (i + 1) + ": " + rowProduct);
        }

        // Get the Product of the Cols then Outputs the Results
        for (int j = 0; j < numCol; j++) {
            int colProduct = 1;
            for (int i = 0; i < numRows; i++) {
                colProduct *= matrix[i][j];
            }
            IO.println("Product of column " + (j + 1) + ": " + colProduct);
        }
    }
}
