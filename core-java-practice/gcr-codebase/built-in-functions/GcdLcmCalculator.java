import java.util.Scanner;

public class GcdLcmCalculator {

    public static int readNumber(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int calculateGcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static int calculateLcm(int a, int b) {
        int gcd = calculateGcd(a, b);
        return (a / gcd) * b;
    }

    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = readNumber(scanner, "Enter first number: ");
        int num2 = readNumber(scanner, "Enter second number: ");

        int gcd = calculateGcd(num1, num2);
        int lcm = calculateLcm(num1, num2);

        displayResult(num1, num2, gcd, lcm);
        scanner.close();
    }
}
