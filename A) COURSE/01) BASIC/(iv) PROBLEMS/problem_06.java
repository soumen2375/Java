//Find remainder , Alaways know that - "Dividend = (Divisor * Quotient) + Remainder"

import java.util.Scanner;
public class problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        int Quotient = (dividend / divisor);
        int remainder = dividend - (divisor * Quotient);
        System.out.println("Remainder is: " + remainder);

        // Alternative, using "%"
        int remainder2 = dividend % divisor;
        System.out.println("Remainder is: " + remainder2);

        sc.close();
    }
}
