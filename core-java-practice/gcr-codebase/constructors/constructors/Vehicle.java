package constructors;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 2000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(2500);
        Vehicle v = new Vehicle("Ravi", "Car");
        v.displayVehicleDetails();
    }
}
