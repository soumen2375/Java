// Binary Search problem using Recursion
public class Problem_06 {
    public static void main(String[] args) {
        int[] arr = { 14, 15, 23, 34, 56, 78 };
        
        System.out.println(binarySearch(arr, 0, arr.length - 1, 56));
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, end, target);
    }
}
