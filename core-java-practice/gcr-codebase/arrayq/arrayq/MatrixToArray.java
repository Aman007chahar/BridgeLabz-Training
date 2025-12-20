package arrayq;

import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rowCount = input.nextInt();
        int colCount = input.nextInt();

        int[][] matrix = new int[rowCount][colCount];

        for (int r = 0; r < rowCount; r++) {
            for (int c = 0; c < colCount; c++) {
                matrix[r][c] = input.nextInt();
            }
        }

        int[] linear = new int[rowCount * colCount];
        int position = 0;

        for (int r = 0; r < rowCount; r++) {
            for (int c = 0; c < colCount; c++) {
                linear[position] = matrix[r][c];
                position++;
            }
        }

        for (int i = 0; i < linear.length; i++) {
            System.out.print(linear[i] + " ");
        }
    }
}
