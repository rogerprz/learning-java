import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String question = "What is your favorite color";
       String choice1 = "blue";
       String choice2 = "red";
       String choice3= "green";

       String correctAnswer = choice2;
       boolean guessedCorrectAnswer = true;
       while (guessedCorrectAnswer) {
           System.out.println(question);
           Scanner input = new Scanner(System.in);
           String answer = input.next();

           if (answer.equals(choice1.toLowerCase())) {
               System.out.println(("Good try, but " + choice1) + " is not correct");

           } else if (answer.equals(choice2)) {
               System.out.println(("Great, " + choice2) + " is correct");
               guessedCorrectAnswer = false;
           } else if (answer.equals(choice3)) {
               System.out.println(("Good try, but " + choice3) + " is not correct");
           }
       }
       System.out.println("END PROGRAM");
    }
}