// Kadane's Algorithm - Maximum Subarray Sum

class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 4, 2, -1, -3};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.print(maxSum);
    }
}

// Time Complexity - O(n)

// Space Complexity - O(1)

// Tracks the current subarray sum and maximum sum.
// If the current sum becomes negative, reset it to zero
// because a negative sum will reduce the sum of the next subarray.
