// Two Pointers Sorted Array Pattern

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 10, 15};
        int target = 10;
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] + arr[right] == target){
                System.out.print("Target Found");
                return;
            }
            else if(target < arr[left] + arr[right]){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.print("Target Not Found");
    }
}

// Time Complexity - O(n)

// Space Complexity - O(1)

// Adds the value of the left and right pointer 
// Compares to the target element if equal target found
// If sum is less than target increase left by 1 to get bigger value
// If sum is greater than target reduce right by 1 to get smaller value