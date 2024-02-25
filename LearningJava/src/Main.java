import java.util.Scanner;

public class Main {

    public static double employeeWeeklySalary(double hours, double hourlyRate) {
        if (hours < 0 || hourlyRate < 1) {
            System.out.println("Negative values are not allowed");
            return -1;
        }
        return hours * hourlyRate * 52;
    }
    
    public static void main(String[] args) {
      double result = employeeWeeklySalary(40, 35);
      System.out.println("Payout: $" + result);

    }
}