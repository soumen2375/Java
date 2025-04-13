//Program to print all the even and odd numbers separately (1-N)
package QUESTIONS;

import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {

        //Take a user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        //Even numbers 
        System.out.print("Even Numbers:");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //Odd numbers
        System.out.print("\nOdd Numbers:");
        for (int j = 1; j <= N; j++) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
            }
        }

        sc.close();
    }
}
