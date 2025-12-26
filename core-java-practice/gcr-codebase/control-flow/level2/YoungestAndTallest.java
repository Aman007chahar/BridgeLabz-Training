package level2;

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {

        int amarAge, akbarAge, anthonyAge;
        double amarHeight, akbarHeight, anthonyHeight;

        Scanner input = new Scanner(System.in);

        amarAge = input.nextInt();
        akbarAge = input.nextInt();
        anthonyAge = input.nextInt();

        amarHeight = input.nextDouble();
        akbarHeight = input.nextDouble();
        anthonyHeight = input.nextDouble();

        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is the tallest");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
    }
}
