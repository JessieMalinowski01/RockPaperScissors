import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.print("Enter your move (rock, paper, or scissors): ");
        String playerMove = scanner.nextLine().toLowerCase();

        int computerMove = random.nextInt(3);  // 0 = rock, 1 = paper, 2 = scissors

        switch (playerMove) {
            case "rock":
                if (computerMove == 0) {
                    System.out.println("It's a tie!");
                } else if (computerMove == 1) {
                    System.out.println("Computer wins!");
                } else {
                    System.out.println("You win!");
                }
                break;
            case "paper":
                if (computerMove == 0) {
                    System.out.println("You win!");
                } else if (computerMove == 1) {
                    System.out.println("It's a tie!");
                } else {
                    System.out.println("Computer wins!");
                }
                break;
            case "scissors":
                if (computerMove == 0) {
                    System.out.println("Computer wins!");
                } else if (computerMove == 1) {
                    System.out.println("You win!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;
            default:
                System.out.println("Invalid move. Please enter rock, paper, or scissors.");
                break;
        }

        scanner.close();
    }
}
