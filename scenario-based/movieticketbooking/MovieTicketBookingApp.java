package movieticketbooking;

import java.util.Scanner;

class MovieTicketBookingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter movie type (2D/3D) or exit: ");
            String movieType = sc.next();

            if (movieType.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter seat type (gold/silver): ");
            String seatType = sc.next();

            System.out.print("Do you want snacks? (yes/no): ");
            String snacksChoice = sc.next();

            int ticketPrice = 0;
            int snacksPrice = 0;

            switch (movieType.toUpperCase()) {
                case "2D":
                    ticketPrice = 150;
                    break;
                case "3D":
                    ticketPrice = 250;
                    break;
                default:
                    System.out.println("Invalid movie type");
                    continue;
            }

            if (seatType.equalsIgnoreCase("gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }

            if (snacksChoice.equalsIgnoreCase("yes")) {
                snacksPrice = 120;
            }

            int totalBill = ticketPrice + snacksPrice;

            System.out.println("Total Ticket Cost: " + ticketPrice);
            System.out.println("Snacks Cost: " + snacksPrice);
            System.out.println("Final Amount to Pay: " + totalBill);
            System.out.println("----------------------------------");
        }

        sc.close();
    }
}
