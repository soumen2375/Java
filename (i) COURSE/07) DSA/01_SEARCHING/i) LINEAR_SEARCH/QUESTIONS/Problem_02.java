package QUESTIONS;
// Search in range of string

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        String[] fruits = { "mango", "banana", "apple", "guava", "orange", "grape", "watermelon", "lychee",
                "jackfruit", "pineapple" };

        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter staring index: ");
        int startIndx = sc.nextInt();
        System.out.print("Enter ending index: ");
        int endIndx = sc.nextInt();
        System.out.print("Enter searching fruits: ");
        String target = sc.next();
        System.out.print(stringSearch(fruits, target, startIndx, endIndx));

        sc.close();
    }

    //searching function    
    static boolean stringSearch(String[] str, String target, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            if (str[i].equals(target)) {                // For string comparison, use .equals() instead of ==
                return true;
            }
        }
        return false;
    }
}
