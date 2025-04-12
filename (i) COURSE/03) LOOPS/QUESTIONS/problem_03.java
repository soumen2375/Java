// Write a program that uses a do-while loop to find the factorial of a given input number
package QUESTIONS;

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int temp = 1;

        if (N == 0) {
            temp = 0;
        }

        while (N > 0) {
            temp = temp * N;
            N--;
        }
        System.out.println(temp);

        sc.close();
    }
}
