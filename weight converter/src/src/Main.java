import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Weight Converter Program

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the weight converter program!");

        double kg = 2.20; // to lb
        double lb = 0.45; // to kg

        while(true){

            System.out.println("1. Convert kgs to lbs");
            System.out.println("2. Convert lbs to kgs");
            System.out.println("3. Exit program");

            System.out.print("Choose an option (enter 1 or 2): ");
            int option = scanner.nextInt();


            if (option != 1 && option != 2 && option != 3){ // very basic error handling for the program
                System.out.print("Please select a valid option (1 or 2 ");
            }

            if (option == 1){
                System.out.print("Enter weight in kgs: ");
                double kgs = scanner.nextDouble();

                double conversionToKgs = kgs * kg;

                System.out.printf("The new weight in kgs is %.2f: ", conversionToKgs);
            }
            else if(option == 2) {
                System.out.print("Enter weight in lbs: ");
                double lbs = scanner.nextDouble();

                double conversionToLbs = lbs * lb;

                System.out.printf("The new weight in kgs is %.2f: ", conversionToLbs);
            }
            else{
                System.out.print("Thank you for using the weight converter!");
            }
        break;

            }

        scanner.close();


    }
}
