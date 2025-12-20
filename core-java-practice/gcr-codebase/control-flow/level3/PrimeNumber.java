package level3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
boolean isPrime = false;
        int number = scanner.nextInt();
        for (int i = 2; i*i <= number; i++) {
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
        System.out.println("Not Prime");}else {
            System.out.println("Prime");
        }
    }
}
