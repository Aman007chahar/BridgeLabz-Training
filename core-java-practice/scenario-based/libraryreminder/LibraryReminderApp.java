package libraryreminder;

import java.util.Scanner;

public class LibraryReminderApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalFine = 0;

        for (int book = 1; book <= 5; book++) {

            System.out.print("Enter due date for book " + book + ": ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date for book " + book + ": ");
            int returnDate = sc.nextInt();

            int fine = 0;

            if (returnDate > dueDate) {
                fine = (returnDate - dueDate) * 5;
            }

            totalFine += fine;

            System.out.println("Fine for book " + book + ": ₹" + fine);
            System.out.println("--------------------------");
        }

        System.out.println("Total Fine for all books: ₹" + totalFine);
        sc.close();
    }
}
