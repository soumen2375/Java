// Write a function to check Armstrong number

import java.util.Scanner;

public class problem_02 {

    public static void armstrongCheck(int num) {
        int originalNum = num;
        int sum = 0;
        while (num >= 1) {
            int mod = num % 10;
            sum = sum + (mod * mod * mod);
            num = num / 10;
        }
        if (originalNum == sum) {
            System.out.print("It's armstrong number");
        } else {
            System.out.print("It's not armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();

        armstrongCheck(num);

        sc.close();
    }

}
