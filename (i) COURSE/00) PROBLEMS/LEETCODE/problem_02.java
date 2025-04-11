
// Power of two
import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a number: ");
        int x = sc.nextInt();

        if (isPowerOfTwo(x)) {
            System.out.println(x + " is a power of two.");
        } else {
            System.out.println(x + " is not a power of two.");
        }

        sc.close();
    }

    public static boolean isPowerOfTwo(int num) {

        if(num < 0){
            return false;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
            if (num == 1) {
                return true;
            }else {
                return false;
            }
    }
}
