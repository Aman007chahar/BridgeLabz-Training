package encapsulation;

public abstract class Vehicle {
    private String vehicleNumber;
    protected double rentalRate;

    public Vehicle(String number, double rate) {
        vehicleNumber = number;
        rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);
}
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car1 extends Vehicle implements Insurable {

    public Car1(String num, double rate) {
        super(num, rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car1 Insurance";
    }
}
