// Find all number disappeared in array
import java.util.Arrays;

public class Problem_02 {
    public static void main(String[] args) {
        int[] num = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(cyclicSort(num));
        System.out.println(Arrays.toString(num));
    }

    static int cyclicSort(int[] arr) {
        int j = 0;
        while (j < arr.length) {
            int correct = arr[j] - 1;
            if (correct < arr.length && correct != j) {
                swap(arr, j, correct);
            } else {
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i] - 1) {
                return i + 1;
            }
        }
        return arr.length;
    }

    // Swap
    static void swap(int[] arr, int firstIndx, int lastIndx) {
        int temp;
        temp = arr[lastIndx];
        arr[lastIndx] = arr[firstIndx];
        arr[firstIndx] = temp;
    }
}
