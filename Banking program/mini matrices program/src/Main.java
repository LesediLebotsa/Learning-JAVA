import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // small program to build matrices to
        // not really worth much haha

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("How many rows: ");
        rows = scanner.nextInt();

        System.out.print("How many columns: ");
        columns = scanner.nextInt();

        System.out.print("What symbol: ");
        symbol = scanner.next().charAt(0);


        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }



    }
}
