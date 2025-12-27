import java.util.Scanner;

public class FactorialRecursion {

    public static int readNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static long factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = readNumber(scanner);
        long result = factorial(num);
        displayResult(num, result);
        scanner.close();
    }
}
