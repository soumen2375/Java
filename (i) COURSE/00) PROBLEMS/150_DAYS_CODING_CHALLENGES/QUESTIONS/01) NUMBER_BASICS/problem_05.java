// Check if a number is prime

import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int count = 0;

        if (number <= 1) {
            count = 1;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    count = 1;
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
