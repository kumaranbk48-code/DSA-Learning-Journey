// Range sum Query using prefix sum

public class Main {
    
    public static void convertToPrefixSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
    }

    public static int getSumRange(int[] prefixSum, int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left - 1];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        
        convertToPrefixSum(nums);
        
        System.out.println(getSumRange(nums, 0, 2)); // Output: 1
        System.out.println(getSumRange(nums, 2, 5)); // Output: -1
        System.out.println(getSumRange(nums, 0, 5)); // Output: -3
    }
}


// Time complexity - o(n)
// Space complexity - o(1)