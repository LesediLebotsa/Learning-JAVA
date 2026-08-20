import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Number Guessing Game");

        int attempts = 3;
        int guess;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min , max + 1);

        System.out.printf("Guess a number between %d - %d\n ", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts -= 1;

            if(guess < randomNumber){
                System.out.println("TOO LOW");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH");
            }

            if(attempts == 0) {
                System.out.println("You have run out of attempts");
            }

        }while(guess != randomNumber && attempts > 0);

        String winOrLose = (guess == randomNumber) ? "You win" : "You lose";

        System.out.print(winOrLose);

        scanner.close();

    }
}
