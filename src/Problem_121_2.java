import java.util.Scanner;

public class Problem_121_2 {
    public static String findWinningMove(String moveA) {
        switch (moveA) {
            case "rock":
                return "paper";
            case "paper":
                return "scissors";
            case "scissors":
                return "rock";
            default:
                return "Invalid move";
        }
        /* Enhanced Switch
        return switch (moveA) {
            case "rock" -> "paper";
            case "paper" -> "scissors";
            case "scissors" -> "rock";
            default -> "Invalid move";
        };
         */
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moveA = scanner.nextLine();
        String moveB = findWinningMove(moveA);
        System.out.println(moveB);
    }
}