package arrayq;

import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double totalHeight = 0.0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            totalHeight = totalHeight + heights[i];
        }

        double meanHeight = totalHeight / heights.length;

        System.out.println("The mean height of the football team is " + meanHeight);
    }
}
