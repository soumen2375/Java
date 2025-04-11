// Check if given number is odd or even
import java.util.Scanner;
public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number%2==0)
        {
            System.out.print(number+" is Even");
        }
        else{
            System.out.print(number+" is Odd");
        }

        sc.close();
    }    
}
