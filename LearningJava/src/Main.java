import java.util.Scanner;

public class Main {
    public static void announceDeveloperTeaTime() {
        System.out.println(("Waiting for tea time"));
        System.out.println("Type a random word..:");
        Scanner input = new Scanner(System.in);

        input.next();
        System.out.println("It's tea time");
    }
    public static void main(String[] args) {
       String question = "What is your favorite color";
       String choice1 = "blue";

       announceDeveloperTeaTime();
    }
}