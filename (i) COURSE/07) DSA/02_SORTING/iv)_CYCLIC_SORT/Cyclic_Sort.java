import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] num = { 3, 5, 2, 1, 4 };
        cyclicSort(num);
        System.out.println(Arrays.toString(num));
    }

    // Cyclic Sort
    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, correct, i);
            }
            else{
                i++;
            }
        }
    }

    // Swap
    static void swap(int[] arr, int firstIndx, int lastIndx) {
        int temp;
        temp = arr[lastIndx];
        arr[lastIndx] = arr[firstIndx];
        arr[firstIndx] = temp;
    }
}
