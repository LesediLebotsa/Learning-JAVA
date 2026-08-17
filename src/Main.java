import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a adjective (descriptive): ");
        String adjective1 = scanner.nextLine();

        System.out.println("Enter a noun (animal): ");
        String noun1 = scanner.nextLine();

        System.out.println("Enter a adjective (descriptive): ");
        String adjective2 = scanner.nextLine();

        System.out.println("Enter a verb (ending with ing): ");
        String verb1 = scanner.nextLine();

        System.out.println("Enter a adjective (descriptive): ");
        String adjective3 = scanner.nextLine();

        System.out.println("I went to a " + adjective1 + " zoo");
        System.out.println("I saw a " + noun1);
        System.out.println(noun1 + " was " + adjective2 + "and " + verb1);
        System.out.println("I was " + adjective3);
        scanner.close();
    }
}