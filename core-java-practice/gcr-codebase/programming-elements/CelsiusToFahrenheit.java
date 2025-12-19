import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        double celsiusTemperature;

        Scanner input = new Scanner(System.in);

        celsiusTemperature = input.nextDouble();

        double fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;

        System.out.println(
                "The temperature in Fahrenheit is " + fahrenheitTemperature
        );
    }
}
