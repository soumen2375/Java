// Program to check if a number is prime or composite
package QUESTIONS;

import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.print(num + " is not Prime Number");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.print(num + " is not Prime Number");
                    break;
                }
                System.out.print(num + " is Prime Number");
            }
        }

        sc.close();
    }
}
