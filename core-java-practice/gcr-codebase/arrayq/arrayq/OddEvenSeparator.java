package arrayq;

import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();

        if (limit <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] oddSet = new int[limit / 2 + 1];
        int[] evenSet = new int[limit / 2 + 1];

        int oddPos = 0;
        int evenPos = 0;

        for (int n = 1; n <= limit; n++) {
            if (n % 2 == 0) {
                evenSet[evenPos] = n;
                evenPos++;
            } else {
                oddSet[oddPos] = n;
                oddPos++;
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddPos; i++) {
            System.out.print(oddSet[i] + " ");
        }

        System.out.println();
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenPos; i++) {
            System.out.print(evenSet[i] + " ");
        }
    }
}
