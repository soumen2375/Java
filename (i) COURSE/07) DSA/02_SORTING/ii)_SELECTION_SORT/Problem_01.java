import java.util.Arrays;

public class Problem_01 {
    public static void main(String[] args) {
        int[] num = { 5, 8, 9, 4, 7 };
        selectionSort(num);
        System.out.println(Arrays.toString(num));
    }
// Selection Sort
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndx = arr.length - i - 1;
            int maxIndx = getMax(arr, 0, lastIndx);
            getSwap(arr, maxIndx, lastIndx);
        }
    }

    // Get Maximum index
    static int getMax(int[] arr, int start, int end){
        int max = start;
        for(int j=start; j<= end; j++){
            if(arr[max] < arr[j]){
                max = j;
            }
        }
        return max;
    }

    // Swap lastindex to max element 
    static void getSwap(int[] arr, int maxIndx, int lastIndx){
        int temp;
        temp = arr[lastIndx];
        arr[lastIndx] = arr[maxIndx];
        arr[maxIndx] = temp;
    }
}