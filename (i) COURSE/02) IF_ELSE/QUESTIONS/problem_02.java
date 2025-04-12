
// Check if given number is divisible by 5 or not
import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {              //"sc.hasNextInt()" to handle wrong input
            int number = sc.nextInt();

            if (number % 5 == 0) {
                System.out.print(number + " is divisible by 5");
            } else {
                System.out.print(number + " is not divisiable by 5");
            }
        } else {
            System.out.print("Invalid input! Enter a valid number");
        }

        sc.close();
    }
}
