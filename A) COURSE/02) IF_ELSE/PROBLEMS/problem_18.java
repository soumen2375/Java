// Given the coordinates (x, y) of a center of a circle and its radius, 
// wap which will determine whether a point lies inside the circle, on the circle or outside the circle.
import java.util.Scanner;
public class problem_18 {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCheck whether a point lies inside, on, or outside the circle:\n");

        // Input for circle center and radius
        System.out.print("Enter x-coordinate of circle center: ");
        int x_center = sc.nextInt();
        System.out.print("Enter y-coordinate of circle center: ");
        int y_center = sc.nextInt();
        System.out.print("Enter radius of the circle: ");
        int radius = sc.nextInt();

        // Input for the point
        System.out.print("Enter x-coordinate of the point: ");
        int x_point = sc.nextInt();
        System.out.print("Enter y-coordinate of the point: ");
        int y_point = sc.nextInt();

        // Calculate squared distance and radius squared
        int distanceSquared = (x_point - x_center) * (x_point - x_center) + 
                              (y_point - y_center) * (y_point - y_center);
        int radiusSquared = radius * radius;

        // Compare and print result
        if (distanceSquared < radiusSquared) {
            System.out.println("The point lies INSIDE the circle.");
        } else if (distanceSquared == radiusSquared) {
            System.out.println("The point lies ON the circle.");
        } else {
            System.out.println("The point lies OUTSIDE the circle.");
        }

        sc.close();
    }
}

