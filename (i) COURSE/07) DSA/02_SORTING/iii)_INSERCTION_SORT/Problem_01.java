import java.util.Arrays;

public class Problem_01 {
    public static void main(String[] args) {
        int[] num = { 5, 3, 9, 4, 7 };
        inserctionSort(num);
        System.out.println(Arrays.toString(num));
    }

    static void inserctionSort(int[] arr){
        for(int i=0 ; i < arr.length - 1; i++){
            for(int j = i+1; j >0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int firstIndx, int lastIndx){
        int temp;
        temp = arr[lastIndx];
        arr[lastIndx] = arr[firstIndx];
        arr[firstIndx] = temp;
    }
}
