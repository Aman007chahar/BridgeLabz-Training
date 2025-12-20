package arrayq;

import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] table = new int[10];

        for (int index = 0; index < 10; index++) {
            table[index] = num * (index + 1);
        }

        for (int index = 0; index < 10; index++) {
            System.out.println(num + " * " + (index + 1) + " = " + table[index]);
        }
    }
}
