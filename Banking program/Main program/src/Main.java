import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        // Simple Banking program
        // Will upgrade this as skills grow and build a capstone JAVA project out of it

        int choice;
        double balance = 0;
        boolean isRunning = true;


    do {
        mainMenu();

        System.out.print("Enter your choice (1 - 4): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdrawal(balance);
            case 4 ->{
                System.out.print("Thank you for using the ATM! Have a nice day!");
                isRunning = false;
            }
            default -> {
                System.out.print("Invalid choice");
                isRunning = false;
            }

        }
    }while(isRunning);

    }
    static void mainMenu(){
        System.out.println("*****************");
        System.out.println("BANKING PROGRAM");
        System.out.println("*****************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("*****************");

    }
    static void showBalance(double balance){
        System.out.printf("Balance is R%.2f\n " , balance);
    }
    static double deposit() {
        double amount = 0;
        System.out.print("How much would you like to deposit?: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.print("Invalid amount. Cannot deposit negative money!");
            return 0;
        }
        else {
            System.out.println("Deposit complete!");
            return amount;
        }
    }
    static double withdrawal(double balance) {
        double amount = 0;

        System.out.print("How much would you like to withdraw?: ");
        amount = scanner.nextDouble();

        if(amount < 0 ){
            System.out.println("Cannot withdraw negative amount!");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Your current balance is " + balance);
            return 0;
        } else{
            System.out.println("Withdrawal complete! " );
            return amount;
        }

    }
}


