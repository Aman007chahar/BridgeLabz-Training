package inheritance;

public interface Refuelable {
    void refuel();
}

class Vehicle1 {
    int maxSpeed;
    String model;
}
class PetrolVehicle extends Vehicle1 implements Refuelable {
    public void refuel() {
        System.out.println("Refueling petrol");
    }
}
class ElectricVehicle extends Vehicle1 {
    void charge() {
        System.out.println("Charging battery");
    }
}
