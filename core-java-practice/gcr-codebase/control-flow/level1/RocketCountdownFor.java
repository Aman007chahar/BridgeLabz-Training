package level1;

import java.util.Scanner;

public class RocketCountdownFor {
    public static void main(String[] args) {

        int counter;
        Scanner input = new Scanner(System.in);

        counter = input.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}