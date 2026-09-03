import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Simple rock, paper, scissors game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        String[] choices = {"rock","paper","scissors"};

        do{
            System.out.print("Enter your choice: (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors") ){
                System.out.println("Please select a valid option");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if(computerChoice.equals(playerChoice)){
                System.out.println("It's a draw");
            }
            else if ((computerChoice.equals("rock") && playerChoice.equals("paper"))
                    || computerChoice.equals("paper") && playerChoice.equals("scissors")
                    || computerChoice.equals("scissors") && playerChoice.equals("rock")) {

                System.out.println("You win");
            }else{
                System.out.print("You lose");
            }

            System.out.print("Would you like to play again?: (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));

        System.out.println("Thank you for playing");




        scanner.close();

    }
}
