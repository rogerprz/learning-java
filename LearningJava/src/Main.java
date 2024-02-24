import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int studentAge = 35;
        double gpa = 3.50;
        String firstName = "Roger";
        String lastName = "Perez";

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(gpa);
        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstInitial);
        System.out.println(lastInitial);

        System.out.println(firstName + " " + lastName + " has a gpa of " + gpa);
        Scanner input = new Scanner(System.in);

        gpa = input.nextDouble();

        System.out.println(firstName + " "+ lastName + " no has a GPA of " + gpa);
    }
}