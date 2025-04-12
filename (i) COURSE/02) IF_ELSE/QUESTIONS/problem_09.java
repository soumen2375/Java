
//  Check if given number is "TWO DIGIT" or not
import java.util.Scanner;

public class problem_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) { // checking for negative number
            number = number * (-1);
        }

        if (number >= 10 && number < 100) {
            System.out.print("Given number is TWO DIGIT");
        } else {
            System.out.print("Given number is not TWO DIGIT");
        }

        sc.close();
    }
}
