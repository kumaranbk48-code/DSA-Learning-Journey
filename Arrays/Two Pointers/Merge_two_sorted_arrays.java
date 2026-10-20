// Merging two sorted arrays using two pointers

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr1_s = sc.nextInt();
        int arr2_s = sc.nextInt();
        
        int[] arr1 = new int[arr1_s];
        int[] arr2 = new int[arr2_s];
        
        for(int i = 0; i < arr1_s; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < arr2_s; i++){
            arr2[i] = sc.nextInt();
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int n = arr1_s + arr2_s;
        int[] res = new int[n];
        
        int i = 0, j = 0, k = 0;
        while (i < arr1_s && j < arr2_s) {
            if (arr1[i] < arr2[j]) {
                res[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                res[k++] = arr2[j++];
            } else {
                // If elements are equal, include both (matching your original logic)
                res[k++] = arr1[i++];
                res[k++] = arr2[j++];
            }
        }
        
        while (i < arr1_s) {
            res[k++] = arr1[i++];
        }
        
        while (j < arr2_s) {
            res[k++] = arr2[j++];
        }
        
        for(int x = 0; x < k; x++){
            System.out.print(res[x] + " ");
        }
    }
}

// Time complexity - o(n + m)
// Space complexity - o(nlogn + mlogm)