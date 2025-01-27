import java.util.Scanner;
public class Quizzapp{
    /**
     * @param args
     */
    public static void main(String[] args){
        // Welcome message
        System.out.println("Welcome to the Quizzapp!");

         // Array for questions.
        String[] questions = {"1. Who wrote the play Romeo and Juliet?",
    "2. Who is known as the father of Computer?", "3. What is the longest river in the world?"};
        // Array for answers.
    String[] answers = {"William Shakespeare", "Charles Babbage", "Nile river"};
     // scanner to get user input.
     Scanner scanner = new Scanner(System.in);
     int score = 0;

     for (int i = 0; i < questions.length; i++){
        System.out.println(questions[i]);

        String userAnswer = scanner.nextLine();

        if (userAnswer.equalsIgnoreCase(answers[i])){
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is: " + answers[i]);
        }
     }
     System.out.println("Quizz over! You scored: " + score + "/" + questions.length);

     scanner.close();
     
     
    }
}