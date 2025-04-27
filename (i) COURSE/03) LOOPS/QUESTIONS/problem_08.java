//Program to print the GP starting any term to...n
package QUESTIONS;

import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a First term: ");
        int a = sc.nextInt();
        System.out.print("Enter difference: ");
        int r = sc.nextInt();
        System.out.print("Enter nth term you want to find ?: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            a = a * r;

        }

        sc.close();
    }
}
