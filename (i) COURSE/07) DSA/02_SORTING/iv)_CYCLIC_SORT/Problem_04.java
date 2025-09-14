
// Find all number disappeared in array
import java.util.Arrays;

public class Problem_04 {
    public static void main(String[] args) {
        int[] num = { 1, 3, 4, 2, 2 };
        System.out.println(cyclicSort(num));
        System.out.println(Arrays.toString(num));
    }

    static int cyclicSort(int[] arr) {
        int j = 0;
        while (j < arr.length) {
            int correct = arr[j] - 1;
            if (arr[j] < arr.length && arr[j] != arr[correct]) { //when array length big than 'j' , when j=1 arr[1]!=arr[2]
                swap(arr, j, correct);
            } else {
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i] - 1) {
                return arr[i];
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
