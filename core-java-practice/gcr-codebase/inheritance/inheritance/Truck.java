package inheritance;

public class Truck extends Vehicle {
    int loadCapacity;

    Truck(int speed, String fuel, int loadCapacity) {
        super(speed, fuel);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
