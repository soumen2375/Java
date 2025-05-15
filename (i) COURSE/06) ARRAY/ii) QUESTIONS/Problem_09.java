// Copy all elements of one array to another

import java.util.Arrays;

public class Problem_09 {
    public static void main(String[] args) {
        int[] arr = { 212, 675, -97, 457, -890, -78, 690 };

        solArray_1(arr);
        solArray_2(arr);

    }

    // From scratch
    public static void solArray_1(int[] arr) {
        int[] arr_new = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr_new[i] = arr[i];
        }

        System.out.println("Old Array: " + Arrays.toString(arr) + "\nNew Array: " + Arrays.toString(arr_new));
    }

    // Using ".clone()" method
    public static void solArray_2(int[] arr) {
        int[] arr_new;
        arr_new = arr.clone();
        System.out.println("Old Array: " + Arrays.toString(arr) + "\nNew Array: " + Arrays.toString(arr_new));
    }

}
