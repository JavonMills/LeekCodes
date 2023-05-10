class Solution {
    public int[] runningSum(int[] nums) {
       
        // var for the array length
        int len = nums.length;
        int currentSum = 0;
        for (int i = 0; i < len; i++){
            currentSum += nums[i];
            nums[i] = currentSum;

        }
        
        return nums;
    }
}
