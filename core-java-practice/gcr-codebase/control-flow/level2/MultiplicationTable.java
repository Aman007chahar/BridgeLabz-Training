package level2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
