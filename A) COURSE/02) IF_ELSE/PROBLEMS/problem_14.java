// Print the least age of three given ages
import java.util.Scanner;
public class problem_14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nFind the least age of three given ages:-\n");

        System.out.print("Enter first age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter second age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter third age: ");
        int age3 = sc.nextInt();

        if (age1 == age2 && age2 == age3) {
            System.out.print("All three ages are equal.");
        } else if (age1 == age2 && age1 < age3) {
            System.out.print("First and Second ages are equal and least: " + age1);
        } else if (age1 == age3 && age1 < age2) {
            System.out.print("First and Third ages are equal and least: " + age1);
        } else if (age2 == age3 && age2 < age1) {
            System.out.print("Second and Third ages are equal and least: " + age2);
        } else if (age1 < age2 && age1 < age3) {
            System.out.print("First age is least: " + age1);
        } else if (age2 < age1 && age2 < age3) {
            System.out.print("Second age is least: " + age2);
        } else {
            System.out.print("Third age is least: " + age3);
        }

        sc.close();
    }
}
