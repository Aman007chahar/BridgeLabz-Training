import java.util.Scanner;

public class FibonacciGenerator {

    public static int readTerms(Scanner scanner) {
        System.out.print("Enter number of terms: ");
        return scanner.nextInt();
    }

    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            return;
        }

        int first = 0;
        int second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terms = readTerms(scanner);
        generateFibonacci(terms);
        scanner.close();
    }
}
