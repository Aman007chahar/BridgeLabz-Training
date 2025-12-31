package snakeandladder;

class Line implements Comparable<Line> {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Line otherLine = (Line) obj;
        return Double.compare(this.calculateLength(), otherLine.calculateLength()) == 0;
    }

    @Override
    public int compareTo(Line otherLine) {
        return Double.compare(this.calculateLength(), otherLine.calculateLength());
    }
}

public class SnakeAndLadder {

    public static void main(String[] args) {

        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(2, 3, 6, 7);

        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }

        int comparisonResult = line1.compareTo(line2);

        if (comparisonResult == 0) {
            System.out.println("Both lines are of equal length");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is smaller than Line 2");
        }
    }
}
