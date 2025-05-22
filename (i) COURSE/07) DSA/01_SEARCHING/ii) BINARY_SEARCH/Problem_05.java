// Find smallest letter greather than target | Note: that the leters wrap around
import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        char[] arr = { 'c', 'e', 'f', 'g', 'i' };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a target character: ");
        char targetChar = sc.next().charAt(0); // Read a single character input

        System.out.println(targetChar + " celling value is: " + floorNum(arr, targetChar));

        sc.close();
    }

    public static char floorNum(char[] arr, char target) {
        int strtIndx = 0, endIndx = arr.length - 1;

        if (arr[endIndx] <= target) {
            return arr[strtIndx]; // if return arr[0] then, it bound the array limit
        }

        while (strtIndx <= endIndx) {
            int mid = (strtIndx + endIndx) / 2;

            if (target > arr[mid]) {
                strtIndx = mid + 1;
            } else if (target < arr[mid]) {
                endIndx = mid - 1;
            } else {
                return arr[mid + 1];
            }
        }
        // If target value is not present in the array, return the floor value
        return arr[endIndx + 1];
    }
}