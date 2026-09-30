class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Current = 0;
        int Max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                Current++;
                Max = Math.max(Current, Max);
            }
            else{
                Current = 0;
            }
        }
        return Max;
    }
}