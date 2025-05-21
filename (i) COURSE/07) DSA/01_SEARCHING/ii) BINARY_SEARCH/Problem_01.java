// Find index number of a given number using Binary Search

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 3, 5, 7, 9, 11, 13, 15, 35, 48 };
        System.out.print("Enter target number: ");
        int target = sc.nextInt();

        System.out.print(target + " index is: " + binarySearch(arr, target));
        sc.close();
    }

    static int binarySearch(int[] arr, int target) {
        int startIndx = 0, endIndx = arr.length - 1;

        while (startIndx <= endIndx) {
            int midIndx = (startIndx + endIndx) / 2;

            if (target > arr[midIndx]) {
                startIndx = midIndx + 1;
            } else if (target < arr[midIndx]) {
                endIndx = midIndx - 1;
            } else {
                return midIndx;
            }
        }
        return -1;
    }
}