package arrayq;
import java.util.Scanner;

public class ValueCollector {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] values = new double[10];
        double total = 0.0;
        int position = 0;

        while (true) {
            double entry = scan.nextDouble();

            if (entry <= 0 || position == values.length) {
                break;
            }

            values[position] = entry;
            position++;
        }

        for (int i = 0; i < position; i++) {
            System.out.println(values[i]);
            total = total + values[i];
        }

        System.out.println("Sum = " + total);
    }
}
