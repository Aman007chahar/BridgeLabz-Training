import java.util.Scanner;

public class TemperatureConverter {

    public static double readTemperature(Scanner scanner) {
        System.out.print("Enter temperature value: ");
        return scanner.nextDouble();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void displayResult(double result, String unit) {
        System.out.println("Converted Temperature: " + result + " " + unit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose conversion (1: F to C, 2: C to F): ");
        int choice = scanner.nextInt();

        double temperature = readTemperature(scanner);

        if (choice == 1) {
            displayResult(fahrenheitToCelsius(temperature), "Celsius");
        } else if (choice == 2) {
            displayResult(celsiusToFahrenheit(temperature), "Fahrenheit");
        }

        scanner.close();
    }
}

