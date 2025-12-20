package level2;

import java.util.Scanner;

public class PowerUsingFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();

        if (number > 0 && power > 0) {

            int result = 1;

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println("Result is " + result);
        } else {
            System.out.println("Please enter positive integers");
        }
    }
}
