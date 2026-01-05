package encapsulation;

 abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
    }
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
class Car extends RideVehicle implements GPS {
    private String location;

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}
class Bike extends RideVehicle {

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.8; // cheaper than car
    }
}
class Auto extends RideVehicle {

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.9;
    }
}
public class RideApp {
    public static void main(String[] args) {

        RideVehicle[] rides = new RideVehicle[3];
        //rides[0] = new Car1("C101", "Rahul", 15);
        rides[1] = new Bike("B202", "Amit", 10);
        rides[2] = new Auto("A303", "Suresh", 12);

        for (RideVehicle ride : rides) {
            ride.getVehicleDetails();
            System.out.println("Fare for 10 km: " + ride.calculateFare(10));
            System.out.println("-----------");
        }
    }
}
