// Container with most water problem using two pointers

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int area = 0;
        int minHeight = 0;
        int width = 0;
        int first = 0;
        int last = n - 1;
        int maxArea = 0;
        while(first < last){
            width = last - first;
            minHeight = Math.min(arr[last], arr[first]);
            area = width * minHeight;
            maxArea = Math.max(area, maxArea);
            if(arr[first] < arr[last]){
                first++;
            }
            else if(arr[first] == arr[last]){
                first++;
                last--;
            }
            else{
                last--;
            }
        }
        System.out.print(maxArea);
    }
}

// Time complexity - o(n)
// Space complexity - o(1)