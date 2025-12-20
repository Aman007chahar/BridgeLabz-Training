package level2;

import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
