package sandeepfitnesstracker;

import java.util.Scanner;

public class SandeepFitnessChallengeTracker {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int total = 0;
            int workoutDays = 0;

            for (int day = 1; day <= 7; day++) {

                System.out.print("Enter push-ups for day " + day + ": ");
                int count = sc.nextInt();

                if (count == 0) {
                    System.out.println("Day " + day + " is a rest day");
                    continue;
                }

                total += count;
                workoutDays++;

                double average = (double) total / workoutDays;

                System.out.printf("After day %d:\n", day);
                System.out.printf("Total Push-ups = %d\n", total);
                System.out.printf("Average Push-ups = %.2f\n", average);
            }

            sc.close();
        }


}
