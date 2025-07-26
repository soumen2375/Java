public class Problem_06 {
    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 8, 8, 10 };
        int target = 7;

        int[] result1 = isWorstCase(nums, target);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] result2 = isBestCase(nums, target);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
    }

    // Worst case approach
    static int[] isWorstCase(int[] arr, int target) {
        int start = -1, end = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (target == arr[i]) {
                start = i;
                break;
            }
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            if (target == arr[j]) {
                end = j;
                break;
            }
        }
        int[] result = { start, end };
        return result;
    }

    // log(n) approach
    static int[] isBestCase(int[] arr, int target) {
        int startIndx = 0, endIndx = arr.length - 1;
        int startPos = -1, endPos = -1;

        while (startIndx <= endIndx) {
            int midIndx = (startIndx + endIndx) / 2;

            if (target > arr[midIndx]) {
                startIndx = midIndx + 1;
            } else if (target < arr[midIndx]) {
                endIndx = midIndx - 1;
            } else { // (target==arr[midIndx])
                startPos = midIndx;
                endPos = midIndx;

                int temp = midIndx;
                while ((0 <= temp - 1) && (target == arr[temp - 1])) {
                    startPos = temp - 1;
                    temp--;
                }

                temp = midIndx;
                while ((arr.length - 1 >= temp) && (target == arr[temp + 1])) {
                    endPos = temp + 1;
                    temp++;
                }
                break;
            }
        }
        int[] result = { startPos, endPos };
        return result;
    }

}
