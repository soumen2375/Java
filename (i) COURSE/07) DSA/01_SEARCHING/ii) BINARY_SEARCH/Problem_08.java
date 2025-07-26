// import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 9, 11, 13, 15, 35, 48 };

        //target input
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter target number: ");
        // int target = sc.nextInt();
        int target = 35;

        System.out.print(infiniteArrayCheck(arr, target));
    }

    static int infiniteArrayCheck(int[] arr, int target){
        int startIndx = 0, endIndx = 1;

        while(target > arr[endIndx]){
            int temp = endIndx + 1;
            endIndx = endIndx + (endIndx - startIndx + 1) * 2;
            startIndx = temp;
        }

        return binarySearch(arr, target, startIndx, endIndx);
    }


    // Binary Search
    static int binarySearch(int[] arr, int target, int startIndx, int endIndx) {
        while (startIndx <= endIndx) {
            int midIndx = startIndx + (endIndx - startIndx) / 2;
            if (target > arr[midIndx]) {

                startIndx = midIndx + 1;
            } else if (target < arr[midIndx]) {
                endIndx = midIndx - 1;
            } else {
                return midIndx;
            }
        }
        return -1;
    }
}