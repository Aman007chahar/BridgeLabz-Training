package constructors;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500.0;

    public CarRental() {
        customerName = "Customer";
        carModel = "Sedan";
        rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println(customerName + " | " + carModel + " | Total Cost: " + calculateTotalCost());
    }
}

