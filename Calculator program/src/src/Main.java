import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Simple Calculator project using switches

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Select an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double total = 0;
        boolean validOperation = true;

        switch(operator) {
            case '+' -> total = (number1 + number2);
            case '-' -> total = (number1 - number2);
            case '*' -> total = (number1 * number2);
            case '/' -> {
                if(number2 == 0){
                    System.out.println("Error: Cannot divide by 0");
                    validOperation = false;
                }
                else{
                    total = (number1 / number2);
                }
            }
            default -> {
                System.out.println("choose a valid operator");
                validOperation = false;
            }

        }

        if(validOperation) {
            System.out.printf("The answer is: %.2f", total);
        }

            scanner.close();



    }
}
