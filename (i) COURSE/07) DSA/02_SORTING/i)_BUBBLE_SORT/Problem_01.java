// Basic Bubble Sorting Algorithm

import java.util.Arrays;

public class Problem_01 {
    public static void main(String[] args) {
        int[] num = { 5, 8, 9, 4, 7 };
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }

    static void bubbleSort(int[] arr) {
        boolean swap;
        // every adjacent elements check
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            // for each step , max item will come at the last respective index
            for (int j = 0; j < arr.length - i - 1; j++) {
                // swap if the current element greather than the after element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap = true;
                }
            }
            // if didn't swap , it means the array is sorted
            if (swap == false) {
                break;
            }
        }
    }
}