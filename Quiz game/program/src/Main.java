import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // quiz game demonstrating usage of arrays & 2d arrays

        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Welcome to the Quiz game!");
        System.out.println("*************************");

        String[] questions = {"What is the function of a router?",
                            "What is the technical name for the brain of the computer",
                            "Which programming language is best for low-level code",
                            "Which is a pillar of Object Oriented Programming",
                            "Who is the CEO of facebook?"};
        //2d array
        String[][] options = {
                              {"1. File storage", "2. File creation", "3. Network encryption", "4. Directing internet traffic"},
                              {"1. Central Processing unit", "2. Solid Sate Drive", "3. Graphical Processing Unit", "4. RAM"},
                              {"1. JavaScript", "2. HTML", "3. Python", "4. Cpp "},
                              {"1. Inheritance", "2. API", "3. System Design", "4. Functions "},
                              {"1. Steve Jobs", "2. Bil Gates", "3. Mark Zuckerberg", "4. Elon Musk"}
        };

        int [] answers = {4, 1, 4, 1, 3};
        int score = 0;
        int guess;

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

        // input validation
            if(guess > 4 || guess < 1 ){
                System.out.println("Your guess should be between 1 and 4");
                System.out.println("*************************************");
            }
            else if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("**********");
                System.out.println("INCORRECT");
                System.out.println("**********");
            }
        }
        System.out.print("Your final score is: " + score + "/5");

        scanner.close();


    }
}