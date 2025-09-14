
// Missing number in array
import java.util.Arrays;

public class Problem_01 {
    public static void main(String[] args) {
        int[] num = { 4, 0, 2, 1 };
        System.out.println(cyclicSort(num));
        System.out.println(Arrays.toString(num));
    }

    // Cyclic Sort
    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, correct, i);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
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
