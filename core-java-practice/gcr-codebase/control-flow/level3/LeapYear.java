package level3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year >= 1582){
            if((year % 4 ==0 && year % 100 != 0) || (year%400 == 0)){
                System.out.println("Leap Year");
            }else {
                System.out.println("Not a Leap year");
            }
        }else {
            System.out.println("Not a valid year!\nPlease input Year >= 1582");
        }

    }
}
