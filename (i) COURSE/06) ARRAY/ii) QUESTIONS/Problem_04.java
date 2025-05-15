// Find the smallest element in an array  
public class Problem_04 {
    public static void main(String[] args) {
        int[] arr = { 212, 675, 97, 457, 890, 78, 690 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.print("Smallest elemnet in an array is: " + min);
    }
}
