// Program to print the AP 1,3,5,7...n
package QUESTIONS;

import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        
        //Take a user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        /* Method-1:
        for (int j = 1; j < (N*2); j +=2) {
            System.out.print(j + " ");
        }
         */
        
        /* Method-2:
         for (int j = 1; j <= (2*N - 1); j +=2) {
             System.out.print(j + " ");
         }
         */

        // Method-3:
        int a = 1, d = 2;
        for(int i = 1; i <= N; i++){
            System.out.print(a + " ");
            a = a + d;
        }

        sc.close();
    }
}
