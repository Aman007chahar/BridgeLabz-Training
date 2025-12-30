package dugitalwatchsimulation;

public class DigitalWatchSimulation {
    public static void main(String[] args) {

        outer:
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                System.out.printf("%02d:%02d\n", hour, minute);

                if (hour == 13 && minute == 0) {
                    break outer;
                }
            }
        }

        System.out.println("Power cut at 13:00");
    }
}
