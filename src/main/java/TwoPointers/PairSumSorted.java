package TwoPointers;

import java.util.ArrayList;

public class PairSumSorted {

    /// O(N) in time and O(1) in space
    ///
    public static ArrayList<Integer> pair_sum_sorted(ArrayList<Integer> nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        if (nums == null || nums.size() < 2) {
            return result;
        }

        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {

            int sum = nums.get(left) + nums.get(right);

            if (sum == target) {
                result.add(left);
                result.add(right);

                return result;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-5);
        nums.add(-2);
        nums.add(3);
        nums.add(4);
        nums.add(6);

        int target = 7;

        System.out.println(pair_sum_sorted(nums, target));
    }
}
