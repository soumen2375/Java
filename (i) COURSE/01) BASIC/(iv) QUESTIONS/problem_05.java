// Sum of 2 numbers taking input

import java.util.Scanner;
public class problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        System.out.println("Total Sum is: " + sum);

        sc.close();
        
    }
}
