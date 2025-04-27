//Dispaly day name b/w 1 to 7

import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number in week(like- 'Monday'=1): ");
        int day_number = sc.nextInt();

        switch (day_number) {
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");
            default -> System.out.print("Enter a valid day number");

        }
    sc.close();
    }
}
