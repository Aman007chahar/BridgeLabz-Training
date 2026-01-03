package inheritance;

public class Motorcycle extends Vehicle {

    Motorcycle(int speed, String fuel) {
        super(speed, fuel);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Two-Wheeler");
    }
}
