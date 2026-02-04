// Sort an arrays of 0s, 1s and 2s
import java.util.Arrays;

public class problem_10 {
    public static int[] sortArray(int[] arr) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (zero > 0) {
                arr[i] = 0;
                zero--;
            } else if (one > 0) {
                arr[i] = 1;
                one--;
            } else {
                arr[i] = 2;
                two--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 2 };
        System.out.println(Arrays.toString(sortArray(arr)));

    }
}
