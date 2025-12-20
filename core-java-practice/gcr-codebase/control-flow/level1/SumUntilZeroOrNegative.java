package level1;

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        double total = 0.0;
        double value;

        Scanner input = new Scanner(System.in);

        while (true) {
            value = input.nextDouble();

            if (value <= 0) {
                break;
            }

            total = total + value;
        }

        System.out.println("The total sum is " + total);
    }
}
