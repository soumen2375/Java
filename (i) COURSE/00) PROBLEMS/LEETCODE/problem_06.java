
// Reverse Array
import java.util.Arrays;

public class problem_06 {

    public static void approach1(int[] arr) {
        int[] reverse_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse_arr[i] = arr[arr.length - 1 - i];
        }

        System.out.println("Acctual Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(reverse_arr));
    }

    public static void approach2(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Acctual Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] my_arr = { 2, 8, 4, 9, 6, 5 };
        approach1(my_arr);
        approach2(my_arr);
    }
}

/*
 * Mistake I have do:-
 * we don't initialize the 'reverse_arr' -> size that's throw a error
 * 'ArrayIndexOutOfBoundsException'
 * Printing Array -> we don't write 'Arrays.toString' but, we write only
 * 'my_arr' that's prints the memory reference, not elements.
 */