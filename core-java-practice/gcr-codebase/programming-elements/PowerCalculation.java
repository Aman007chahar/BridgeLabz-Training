import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {

        double base;
        double exponent;

        Scanner input = new Scanner(System.in);

        base = input.nextDouble();
        exponent = input.nextDouble();

        double powerResult = Math.pow(base, exponent);

        System.out.println(
                "The result of " + base + " raised to the power " + exponent + " is " + powerResult
        );
    }
}
