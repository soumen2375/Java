
// Check if given year is leap year or not
import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");

        if (sc.hasNextInt()) {
            int year = sc.nextInt();

            if (year<=0) {
                System.out.print("Invalid input! Enter a valid Year");
            } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.print(year + " is a Leap Year");
            } else {
                System.out.print(year + " is not a Leap Year");
            }
        } else {
            System.out.print("Invalid input! Enter a valid Year");
        }

        sc.close();
    }
}
