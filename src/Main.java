// Demonstrates use of arithmetics in Java
// Very beginner-friendly

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What would you like to buy?: ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        double price = scanner.nextDouble();

        System.out.print("How many " + item + "'s would you like?: ");
        int quantity = scanner.nextInt();

        System.out.println("You have bought " + quantity + item + "'s");
        double total = price * quantity;
        System.out.print("Your total is: " + "R" + total);


    }
}
