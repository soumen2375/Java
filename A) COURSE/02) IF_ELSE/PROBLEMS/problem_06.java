// Check if AREA of rectangle is greater than its PERIMETER

import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        // NOTE: less than 5 values, area will not be greater than the perimeter
        if (area > perimeter) {
            System.out.println("AREA of rectangle is greater than its PERIMETER");
        } else if (area == perimeter) {
            System.out.println("AREA of rectangle is equal to its PERIMETER");
        } else {
            System.out.println("AREA of rectangle is not greater than its PERIMETER");
        }

        sc.close();
    }
}
