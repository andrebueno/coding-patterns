package TwoPointers;

import java.util.*;

public class TripletSum {

    public static List<List<Integer>> threeSum(List<Integer> nums) {
        Collections.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.size();

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums.get(i).equals(nums.get(i - 1))) continue;

            int left = i + 1, right = n - 1;
            int target = -nums.get(i);

            while (left < right) {
                int sumLR = nums.get(left) + nums.get(right);

                if (sumLR == target) {
                    result.add(Arrays.asList(nums.get(i), nums.get(left), nums.get(right)));

                    while (left < right && nums.get(left).equals(nums.get(left + 1))) {
                        left++;
                    }
                    while (left < right && nums.get(right).equals(nums.get(right - 1))) {
                        right--;
                    }
                    left++;
                    right--;

                } else if (sumLR < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> entrada = Arrays.asList(-1, 0, 1, 2, -1, -4);
        System.out.println(threeSum(new ArrayList<>(entrada)));
    }
}
