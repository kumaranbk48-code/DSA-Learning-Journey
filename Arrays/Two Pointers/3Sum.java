// 3Sum using Two pointers

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int mid = i + 1;
            int last = size - 1;

            while (mid < last) {
                int sum = nums[i] + nums[mid] + nums[last];

                if (sum > 0) {
                    last--;
                } else if (sum < 0) {
                    mid++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[mid], nums[last]));
                    mid++;
                    last--;

                    while (mid < last && nums[mid] == nums[mid - 1]) {
                        mid++;
                    }

                    while (mid < last && nums[last] == nums[last + 1]){
                        last--;
                    }
                }
            }
        }
        System.out.print(result);

// Time complexity - o(n²)
// Space complexity - o(logn) to o(n)