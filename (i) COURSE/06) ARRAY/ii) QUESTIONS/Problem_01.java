//Swapping two numbers in array

import java.util.Arrays;
public class Problem_01 {
    public static void main(String[] args) {
        int[] number = {2, 3, 4, 5, 6};

        swapArray(number, 1, 2);
        System.out.print(Arrays.toString(number));
    }

    public static void swapArray(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
