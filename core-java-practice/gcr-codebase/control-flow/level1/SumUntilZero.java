package level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        double total = 0.0;
        double value;

        Scanner input = new Scanner(System.in);

        value = input.nextDouble();

        while (value != 0) {
            total = total + value;
            value = input.nextDouble();
        }

        System.out.println("The total sum is " + total);
    }
}

