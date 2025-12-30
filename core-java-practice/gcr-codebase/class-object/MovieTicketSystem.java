public class MovieTicketSystem {

    static class MovieTicket {
        String movieName;
        String seatNumber;
        double price;
        boolean booked;

        void bookTicket(String movie, String seat, double price) {
            if (booked) {
                System.out.println("House full!!! sorry..... Ticket already booked");
            } else {
                this.movieName = movie;
                this.seatNumber = seat;
                this.price = price;
                booked = true;
                System.out.println("Ticket booked for movie: " + movie);
                System.out.println("Seat Number: " + seat);
            }
        }

        void display() {
            if (!booked) {
                System.out.println("Ticket have not booked yet....");
            } else {
                System.out.println("Ticket booked for movie: " + movieName);
                System.out.println("Seat Number: " + seatNumber);
                System.out.println("Price: $" + price);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.display();
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.bookTicket("Dragon", "A10", 120);
        System.out.println("Price: $120.0\n");

        ticket.display();
    }
}
