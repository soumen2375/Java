// Check whether THREE given numbers can be SIDES of a TRIANGLE

import java.util.Scanner;

public class problem_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTHREE given numbers can be SIDES of a TRIANGLE or not:-\n");

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        if (((number1 + number2) > number3) && ((number2 + number3) > number1) && ((number3 + number1) > number2)) {
            System.out.print("It is SIDES of a TRIANGLE");
        } else {
            System.out.print("It is not SIDES of a TRIANGLE");
        }

        sc.close();
    }
}
