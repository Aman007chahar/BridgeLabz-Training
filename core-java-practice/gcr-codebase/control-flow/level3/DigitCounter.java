package level3;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); // User input
        int count = 0;                // To store the number of digits
        int temp = number;            // Keep a copy of original number

        // Handle negative numbers
        if (temp < 0) {
            temp = -temp;
        }

        // Loop to count digits
        if (temp == 0) {  // Special case when number is 0
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10; // Remove last digit
                count++;           // Increase count
            }
        }

        System.out.println("The number of digits in " + number + " is " + count);
    }
}
