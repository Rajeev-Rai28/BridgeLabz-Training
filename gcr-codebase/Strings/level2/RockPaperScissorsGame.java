/*
Rock-Paper-Scissors game between User and Computer.
Displays game-wise results, total wins, and winning percentage.
*/

import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method to generate computer choice
    public String getComputerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "rock";
        else if (choice == 1)
            return "paper";
        else
            return "scissors";
    }

    // Method to find winner
    // Returns: "User", "Computer", or "Draw"
    public String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }

        return "Computer";
    }

    // Method to calculate stats and percentage
    public String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf(compPercent);

        return stats;
    }

    // Method to display results
    public void displayResults(String[][] gameData, String[][] stats) {

        System.out.println("\nGame\tUser Choice\tComputer Choice\tWinner");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < gameData.length; i++) {
            System.out.println((i + 1) + "\t" + gameData[i][0] + "\t\t"
                    + gameData[i][1] + "\t\t" + gameData[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWinning %");
        System.out.println("----------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t"
                    + Integer.parseInt(stats[i][1]) + "\t"
                    + Double.parseDouble(stats[i][2]));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        RockPaperScissorsGame obj = new RockPaperScissorsGame();

        String[][] gameData = new String[games][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < games; i++) {

            System.out.print("\nEnter choice for game " + (i + 1) + " (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String computerChoice = obj.getComputerChoice();
            String winner = obj.findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;

            gameData[i][0] = userChoice;
            gameData[i][1] = computerChoice;
            gameData[i][2] = winner;
        }

        // Calculate statistics
        String[][] stats = obj.calculateStats(userWins, compWins, games);

        // Display final results
        obj.displayResults(gameData, stats);

        sc.close();
    }
}
