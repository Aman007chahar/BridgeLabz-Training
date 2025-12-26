package arrayq;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        if (limit <= 0) {
            System.out.println("Invalid input");
            return;
        }

        String[] output = new String[limit + 1];

        for (int i = 0; i <= limit; i++) {
            if (i == 0) {
                output[i] = "0";
            } else if (i % 3 == 0 && i % 5 == 0) {
                output[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                output[i] = "Fizz";
            } else if (i % 5 == 0) {
                output[i] = "Buzz";
            } else {
                output[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i <= limit; i++) {
            System.out.println("Position " + i + " = " + output[i]);
        }
    }
}
