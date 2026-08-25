import java.util.Random;
import java.util.Scanner;

// Just a tiny and simple fun little program to reinforce knowledge

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int noOfDice;
        int rolls;
        int total = 0;

        System.out.print("How many dice would you like to roll?: ");
        noOfDice = scanner.nextInt();

        if(noOfDice > 0){
            for( int i = 0; i < noOfDice; i++){
                rolls = random.nextInt(1, 7);
                System.out.println("You rolled a : " + rolls);
                total += rolls;
            }
            System.out.print("Total rolls: " + total);
        }
        else{
            System.out.print("Cannot be a negative");
        }

        scanner.close();
    }

}
