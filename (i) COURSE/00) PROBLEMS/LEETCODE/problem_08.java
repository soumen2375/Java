// Check if Array is Sorted
public class problem_08 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 1, 9 };
        int flag = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
