// Palindrome Number
import java.util.Scanner;
public class problem_01{

    public static boolean isPalindrome(int x){
        int num = x;
        int reverse = 0;

        if(num < 0){
            System.out.print("Enter a postive number");
            return false;
        }

        /* Logic */
        
        while (num > 0) {
            int remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }

        if(reverse==x){
            System.out.print(x + " is palindrome number");
            return true;
        }else{
            System.out.print(x + " is not a palindrome number");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a number: ");
        int x = sc.nextInt();

        isPalindrome(x);

        sc.close();
    }

    
}

