import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {

        double radius;
        double height;

        Scanner input = new Scanner(System.in);

        radius = input.nextDouble();
        height = input.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("The volume of the cylinder is " + volume);
    }
}
