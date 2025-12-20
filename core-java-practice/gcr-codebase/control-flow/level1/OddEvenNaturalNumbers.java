package level1;

import java.util.Scanner;

public class OddEvenNaturalNumbers {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
