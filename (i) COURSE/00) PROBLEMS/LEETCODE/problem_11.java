// Find All Duplicates in an Array(442)
import java.util.ArrayList;
import java.util.List;

public class problem_11 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int element = Math.abs(nums[i]);
            int seat = element - 1;
            if (nums[seat] < 0) { // main conditions if 'true' it add into list
                list.add(element);
            } else {
                nums[seat] = -nums[seat];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        problem_11 obj = new problem_11();
        System.out.println(obj.findDuplicates(nums));
    }
}
