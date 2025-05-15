// Reverse an array 

import java.util.Arrays;

public class Problem_10 {
    public static void main(String[] args) {
        int[] arr = { 212, 675, -97, 457, -890, -78, 690 };
        System.out.print("\nPreviously array: " + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("\nReverse array: " + Arrays.toString(arr));

    }
}
