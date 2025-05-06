//Simple sum program to show how function syantax write
/*
        return_type name (arguments) {
            // body
            return statement;
        }

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter first number: ");
        int num2 = sc.nextInt();

        System.out.print("Sum = " + sum(num1, num2));

        sc.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
