public class Problem_07 {
    public static void main(String[] args) {
        // Example input
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        // Create an instance of the Problem class
        Problem_07 problem = new Problem_07();

        // Call the searchRange method and store the result
        int[] result = problem.searchRange(nums, target);

        // Print the result
        System.out.println("Target range: [" + result[0] + ", " + result[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // Check for the first occurrence of the target
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            // Check for the last occurrence of the target
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // This function returns the index value of the target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Narrow down to the left side
                } else {
                    start = mid + 1; // Narrow down to the right side
                }
            }
        }


        return ans;
    }
}