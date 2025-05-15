// Count positive and negative numbers in an array

public class Problem_08 {
    public static void main(String[] args) {
        int[] arr = { 212, 675, -97, 457, -890, -78, 690, 0 };
        int positive_no = 0;
        int negative_no = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive_no++;
            } else if (arr[i] < 0) {
                negative_no++;
            } else {
                continue;
            }
        }

        System.out.print("No. of positive numbers: " + positive_no + "\nNo. of negative numbers: " + negative_no);
    }
}
