//take a user input using "Scanner class"
import java.util.Scanner;

public class app_scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String myName = sc.nextLine();

        System.out.print("Enter your age: ");
        int myAge = sc.nextInt();

        System.out.println("My name is: " + myName);
        System.out.println("My age is: " + myAge);

        sc.close(); // Properly closing Scanner
    }
}
