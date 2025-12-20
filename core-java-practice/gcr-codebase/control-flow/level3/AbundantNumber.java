package level3;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;

        // Sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors > number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }
    }
}
