//Print the greatest of three given numbers

import java.util.Scanner;

public class problem_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nFind the greatest of three given numbers:-\n");

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: \n");
        int number3 = sc.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.print("All three numbers are equal.");
        } else if (number1 == number2 && number1 > number3) {
            System.out.print("First and Second numbers are equal and greatest: " + number1);
        } else if (number1 == number3 && number1 > number2) {
            System.out.print("First and Third numbers are equal and greatest: " + number1);
        } else if (number2 == number3 && number2 > number1) {
            System.out.print("Second and Third numbers are equal and greatest: " + number2);
        } else if (number1 > number2 && number1 > number3) {
            System.out.print("First number is greatest: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.print("Second number is greatest: " + number2);
        } else {
            System.out.print("Third number is greatest: " + number3);
        }

        sc.close();
    }
}

