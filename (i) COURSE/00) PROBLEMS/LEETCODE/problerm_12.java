// First Missing Positive(41)
public class problerm_12 {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Data Filtering
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] >= n + 1) {
                nums[i] = n + 1;
            }
        }

        // Mark Visited
        for (int i = 0; i < n; i++) {
            int element = Math.abs(nums[i]);
            int seat = element - 1;

            if (element == n + 1) {
                continue;
            }
            if (nums[seat] > 0) {
                nums[seat] = -nums[seat];
            }
        }

        // Postive value Check
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

     public static void main(String[] args) {
        int[] nums = { 1,2,3 };

        System.out.println(firstMissingPositive(nums));
    }
}
