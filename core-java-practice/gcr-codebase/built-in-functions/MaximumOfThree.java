import java.util.Scanner;

public class MaximumOfThree {

    // Function to take integer input from user
    public static int readNumber(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to calculate maximum of three numbers
    public static int findMaximum(int first, int second, int third) {
        int max = first;

        if (second > max) {
            max = second;
        }

        if (third > max) {
            max = third;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = readNumber(scanner, "Enter first number: ");
        int num2 = readNumber(scanner, "Enter second number: ");
        int num3 = readNumber(scanner, "Enter third number: ");

        int maximum = findMaximum(num1, num2, num3);

        System.out.println("Maximum of the three numbers is: " + maximum);

        scanner.close();
    }
}
