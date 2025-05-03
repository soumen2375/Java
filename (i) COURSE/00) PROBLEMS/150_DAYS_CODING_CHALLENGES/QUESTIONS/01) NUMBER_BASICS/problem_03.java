
// Check if a number is even or odd
import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.print("It's even number");
        } else {
            System.out.print("It's odd number");
        }

        sc.close();
    }
}
