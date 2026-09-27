// Sliding Window Fixed Size Pattern

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int windowSum = 0;
        int k = 3;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.print(maxSum);
    }
}

// Time Complexity - O(n)

// Space Complexity - O(1)

//First calculate the sum of the first `k` elements.
//Then slide the window one position at a time:
//- Remove the element leaving the window.
//- Add the new element entering the window.
//- Compare the current window sum with the maximum sum.