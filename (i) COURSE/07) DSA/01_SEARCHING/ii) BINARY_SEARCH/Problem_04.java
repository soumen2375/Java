// Floor of a numbers

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 9 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a target number: ");
        int targetNum = sc.nextInt();

        System.out.println(targetNum + " floor value is: " + floorNum(arr, targetNum));

        sc.close();
    }

    public static int floorNum(int[] arr, int target) {
        int strtIndx = 0, endIndx = arr.length - 1;

        while (strtIndx <= endIndx) {
            int mid = (strtIndx + endIndx) / 2;

            if (target > arr[mid]) {
                strtIndx = mid + 1;
            } else if (target < arr[mid]) {
                endIndx = mid - 1;
            } else {
                //if target value present in array then it return
                return arr[mid];
            }
        }
        //if target value is not present in array then it return
        return arr[endIndx];
    }
}
