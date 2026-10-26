// Pivot index using prefix sum

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];  
            if(rightSum == leftSum){
                System.out.print(i);
                return
            }
            leftSum += arr[i];
        }
        System.out.print(-1);
    }
}

// Time complexity - o(n)
// Space complexity - o(1)