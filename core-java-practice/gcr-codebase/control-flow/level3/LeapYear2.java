package level3;

import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        boolean isLeap = (year >= 1582) && ((year % 4== 0 && year % 100 != 0) || (year % 400 == 0));
        if(isLeap){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }

    }
}