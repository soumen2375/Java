
//Check if given number is divisible by 3 or 5
import java.util.Scanner;

public class problem_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number % 3 == 0 || number % 5 == 0) {
                System.out.print(number + " is divisible by 3 or 5");
            } else {
                System.out.print(number + " is not divisible by  5 or 3");
            }
        } else {
            System.out.print("Invalid input! Enter a valid number");
        }

        sc.close();
    }
}
