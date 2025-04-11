// Check if given number is "THREE DIGIT" or not
import java.util.Scanner;
public class problem_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0){        //checking for negative number
            number = number * (-1);
        }

        if (number >= 100 && number <1000) { 
            System.out.print("Given number is THREE DIGIT");
        } else {
            System.out.print("Given number is not THREE DIGIT");
        }

        sc.close();
    }
}
