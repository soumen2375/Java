// Find the largest element in an array 

public class Problem_03 {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 9, 45, 89, 78, 69 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("largest elemnet in an array is: " + max);
    }
}
