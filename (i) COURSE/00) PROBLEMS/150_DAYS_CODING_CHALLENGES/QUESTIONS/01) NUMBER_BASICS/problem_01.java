
// Check if a number is positive, negative, or zero
import java.util.Scanner;

public class problem_01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        double number = sc.nextDouble();

        if (number > 0) {
            System.out.print(number + " is positive number");
        } else if (number < 0) {
            System.out.print(number + " is negative number");
        } else if (number == 0) {
            System.out.print("It is zero");
        } else {
            System.out.print("Enter a valid number");
        }

        sc.close();
    }
}