// Prefix Sum

class Main {
    public static void main(String[] args) {
        int[] arr = {19,41, 62, 56, 23, 43};
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
            
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}

//Time Complexity - O(n)

// Space Complexity - O(1)

// The current element is added to the previous prefix sum