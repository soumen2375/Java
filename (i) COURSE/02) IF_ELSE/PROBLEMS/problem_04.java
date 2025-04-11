// Print the absolute value of given input number

import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (sc.hasNextDouble()) {
            Double number = sc.nextDouble();

            if (number < 0) {
                number = (number * -1);         //it can be done easily using java in-build funtcion "number = Math.abs(number);""
            }
            System.out.print("Absolute value is: " + number);
        } else {
            System.out.print("Invalid input! Enter a valid number");
        }

        sc.close();
    }
}
