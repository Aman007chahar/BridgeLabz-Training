package levelTwo;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        double number1;
        double number2;

        Scanner input = new Scanner(System.in);

        number1 = input.nextDouble();
        number2 = input.nextDouble();

        double additionResult = number1 + number2;
        double subtractionResult = number1 - number2;
        double multiplicationResult = number1 * number2;
        double divisionResult = number1 / number2;

        System.out.println(
                "The addition, subtraction, multiplication, and division value of 2 numbers " +
                        number1 + " and " + number2 + " is " +
                        additionResult + ", " +
                        subtractionResult + ", " +
                        multiplicationResult + ", and " +
                        divisionResult
        );
    }
}
