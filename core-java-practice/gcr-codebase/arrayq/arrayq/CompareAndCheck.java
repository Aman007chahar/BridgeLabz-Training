package arrayq;

import java.util.Scanner;

public class CompareAndCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                if(arr[i] % 2 == 0){
                    System.out.println("Even");
                }else if(arr[i] % 2 != 0){
                    System.out.println("odd");
                }
            } else if (arr[i] == 0) {
                System.out.println("Zero");
            }
            else {
                System.out.println("Negative");
            }
        }
    }
}