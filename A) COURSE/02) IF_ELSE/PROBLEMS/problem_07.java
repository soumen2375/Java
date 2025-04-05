// Given length and breadth, check if given rectangle is a SQUARE or not

import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        if (length == breadth) {
            System.out.print("Given rectangle is a SQUARE");
        } else {
            System.out.print("Given rectangle is not a SQUARE");
        }

        sc.close();
    }
}