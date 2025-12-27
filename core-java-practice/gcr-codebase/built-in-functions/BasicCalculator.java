import java.util.Scanner;

public class BasicCalculator {

    public static double readNumber(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        double num1 = readNumber(scanner, "Enter first number: ");
        double num2 = readNumber(scanner, "Enter second number: ");

        double result = 0;

        if (choice == 1) {
            result = add(num1, num2);
        } else if (choice == 2) {
            result = subtract(num1, num2);
        } else if (choice == 3) {
            result = multiply(num1, num2);
        } else if (choice == 4) {
            result = divide(num1, num2);
        }

        displayResult(result);
        scanner.close();
    }
}
