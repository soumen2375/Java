//Given an integer N , print its multiples 1 to 10
package QUESTIONS;  
import java.util.Scanner;
public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int N = sc.nextInt();

        for(int i=1; i<=10;i++){
            int result = N * i;
            System.out.print(N + " x " + i + " = " + result +"\n") ;
        }

        sc.close();
    }
}
