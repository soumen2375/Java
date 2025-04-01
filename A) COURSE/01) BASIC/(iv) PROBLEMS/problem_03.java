
// Calculating area of a circle
import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double pi = 3.1415;

        double area = pi * radius * radius;
        System.out.print("Area is: " + area);

        sc.close();
    }
}
