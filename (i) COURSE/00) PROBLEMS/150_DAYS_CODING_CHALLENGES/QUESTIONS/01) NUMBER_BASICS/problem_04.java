
// Check whether a year is a leap year
import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.print(year + " is Leap year");
        } else {
            System.out.print(year + " is not Leap year");
        }

        sc.close();
    }
}
