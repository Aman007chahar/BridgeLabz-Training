public class Circle1 {
    double radius;

    void calculate() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area of circle: %.4f%n", area);
        System.out.printf("Circumference of circle: %.4f%n", circumference);
    }

    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.radius = 2.5;

        c.calculate();
    }
}

