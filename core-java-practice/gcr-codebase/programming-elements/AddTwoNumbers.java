import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;

        Scanner input = new Scanner(System.in);

        firstNumber = input.nextDouble();
        secondNumber = input.nextDouble();

        double sum = firstNumber + secondNumber;

        System.out.println("The sum of the two numbers is " + sum);
    }
}
