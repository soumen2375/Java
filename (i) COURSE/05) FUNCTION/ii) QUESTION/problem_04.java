// Write a function to Swap two numbers

import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.print("number1 = " + num1 + "\nnumber2 = " + num2);

        sc.close();

    }
}
