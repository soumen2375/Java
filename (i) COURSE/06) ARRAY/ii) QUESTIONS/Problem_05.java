// Calculate the sum of all elements in an array

public class Problem_05 {
    public static void main(String[] args) {
        int[] arr = { 212, 675, 97, 457, 890, 78, 690 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.print("Sum of all elements in an array is: " + sum);
    }
}
