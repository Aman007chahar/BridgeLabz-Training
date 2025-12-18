package levelTwo;

import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {

        double perimeter;

        Scanner input = new Scanner(System.in);

        perimeter = input.nextDouble();

        double sideLength = perimeter / 4;

        System.out.println(
                "The length of the side is " + sideLength +
                        " whose perimeter is " + perimeter
        );
    }
}
