package string;

import java.util.Scanner;

public class StudentVotingCheck {

    static int[] generateAges(int count) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[count];

        for (int i = 0; i < count; i++) {
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    static String[][] evaluateVoting(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    static void displayResult(String[][] data) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        int studentCount = 10;

        int[] ages = generateAges(studentCount);
        String[][] votingStatus = evaluateVoting(ages);
        displayResult(votingStatus);
    }
}

