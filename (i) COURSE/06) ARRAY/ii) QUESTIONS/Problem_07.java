// Count even and odd numbers in an array 

public class Problem_07 {
    public static void main(String[] args) {
        int[] arr = { 212, 675, 97, 457, 890, 78, 690 };
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.print("No. of even numbers: " + even + "\nNo. of odd numbers: " + odd);
    }
}
