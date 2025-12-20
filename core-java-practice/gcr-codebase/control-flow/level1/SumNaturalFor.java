package level1;

import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        if (n >= 1) {
            int sumFor = 0;

            for (int i = 1; i <= n; i++) {
                sumFor = sumFor + i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop = " + sumFor);
            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Both results are equal? " + (sumFor == sumFormula));
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
