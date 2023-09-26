import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.print("Enter your choice (rock, paper, or scissors) or 'quit' to exit: ");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (playerChoice.equals("quit")) {
                break;
            }

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please choose 'rock', 'paper', or 'scissors'.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("You chose: " + playerChoice);
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }

            System.out.println("Player: " + playerScore + " | Computer: " + computerScore);
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
