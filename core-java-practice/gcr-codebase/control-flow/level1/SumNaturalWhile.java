package level1;

import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        if (n >= 1) {
            int sumWhile = 0;
            int counter = 1;

            while (counter <= n) {
                sumWhile = sumWhile + counter;
                counter++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + sumWhile);
            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Both results are equal? " + (sumWhile == sumFormula));
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
