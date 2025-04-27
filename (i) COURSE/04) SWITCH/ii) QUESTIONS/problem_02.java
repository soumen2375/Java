
//Weekdays and Weekends in week
import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number in week(like- 'Monday'=1): ");
        int day_number = sc.nextInt();

        switch (day_number) {
            case 1, 2, 3, 4, 5 -> System.out.print("Weekday");
            case 6, 7 -> System.out.print("Weekend");
            default -> System.out.print("Enter a valid day number");

        }
        sc.close();
    }
}
