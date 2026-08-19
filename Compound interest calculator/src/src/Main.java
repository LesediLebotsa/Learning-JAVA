import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter interest rate (in %): ");
        rate = scanner.nextDouble() / 100; // to get percentage in . form ( 7 -> 0,07)

        System.out.print("How many times a year does compounding take place?: ");
        timesCompounded = scanner.nextInt();

        System.out.print("How many years invested?: ");
        years = scanner.nextInt();

        // Compound interest formula

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("Your final amount is: %.2f", amount);


    }
}
