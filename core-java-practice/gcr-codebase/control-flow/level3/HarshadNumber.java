package level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();  // User input
        int sum = 0;
        int temp = number;             // Preserve original number

        // Sum of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }

        // Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}

