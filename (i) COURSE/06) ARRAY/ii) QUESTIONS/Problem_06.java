// Calculate the average of array elements

public class Problem_06 {
    public static void main(String[] args) {
        int[] arr = { 212, 675, 97, 457, 890, 78, 690 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.print("The average of array elements: " + avg);
    }
}
