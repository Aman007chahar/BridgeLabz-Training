package level2;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer");
        }
    }
}
