package levelOne;

public class SamAveragePCM {
    public static void main(String[] args) {

        int mathsScore = 94;
        int physicsScore = 95;
        int chemistryScore = 96;

        int totalMarks = mathsScore + physicsScore + chemistryScore;
        double averagePercentage = totalMarks / 3.0;

        System.out.println("Sam’s average mark in PCM is " + averagePercentage);
    }
}
