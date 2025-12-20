package arrayq;

import java.util.Scanner;

public class TableSixToNine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];

        int idx = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[idx] = number * i;
            idx++;
        }

        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[idx]);
            idx++;
        }
    }
}
