package inheritance;

public class Thermostat extends Device {
    int temperature;

    Thermostat(int id, boolean status, int temperature) {
        super(id, status);
        this.temperature = temperature;
    }

    void displayStatus() {
        System.out.println("Temp: " + temperature + " | Status: " + status);
    }
}
