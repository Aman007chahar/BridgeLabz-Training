package level2;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {

        double salary;
        int yearsOfService;

        Scanner input = new Scanner(System.in);

        salary = input.nextDouble();
        yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } else {
            System.out.println("The bonus amount is 0");
        }
    }
}
