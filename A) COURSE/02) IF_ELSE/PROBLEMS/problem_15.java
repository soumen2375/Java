// WAP to check if given three points (x1, y1), (x2, y2), (x3, y3) fall on one straight line

import java.util.Scanner;
public class problem_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCheck if all three points fall on one straight line or not:-\n");

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();
        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        int m1_slope = (y2 - y1) / (x2 - x1);
        int m2_slope = (y3 - y2) / (x3 - x2);

        if(m1_slope == m2_slope){
            System.out.print("All three points fall on one straight line ");
        }else{
            System.out.print("All three points are not on one straight line ");
        }


        sc.close();
    }
}
