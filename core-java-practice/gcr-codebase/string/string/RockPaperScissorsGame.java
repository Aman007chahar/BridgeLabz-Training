package string;

import java.util.Scanner;

public class RockPaperScissorsGame {

    static String getComputerChoice() {
        int value = (int) (Math.random() * 3);
        if (value == 0) return "rock";
        if (value == 1) return "paper";
        return "scissors";
    }

    static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("rock") && computer.equals("scissors")) return "User";
        if (user.equals("paper") && computer.equals("rock")) return "User";
        if (user.equals("scissors") && computer.equals("paper")) return "User";
        return "Computer";
    }

    static String[][] calculateStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];
        double userPercent = (userWins * 100.0) / games;
        double computerPercent = (computerWins * 100.0) / games;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent);

        return stats;
    }

    static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results");
        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2]);
        }

        System.out.println("\nStatistics");
        System.out.println("Player\tWins\tWin %");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameResults = new String[games][3];
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice for game " + (i + 1) + " (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(gameResults, stats);
    }
}
