// Given a point (x, y) wap to find out if lies on X-axis , Y-axis, Origin or elsewhere

import java.util.Scanner;
public class problem_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nFind out (x, y) on X-axis , Y-axis, Origin or elsewhere:-\n");

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        if (x==0 && y==0) {
            System.out.print("It lies on \"Origin\"");
        } 
        else if (x==0) {
            System.out.print("It lies on \"Y-axis\"");
        } 
        else if (y==0) {
            System.out.print("It lies on \"X-axis\"");
        } 
        
        else {
            System.out.print("Enter a valid input");
        }

        sc.close();
    }
}
