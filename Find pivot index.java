class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int total =0;
        int leftSum=0;
        int result = -1;
        // loops once to get total size
        for(int i = 0; i < len; i++){
            total += nums[i];
        }
        for(int a = 0; a < len; a++){

            if (a == 0 && leftSum * 2 == total - nums[a]){
                result = 0;
                break;
            }
           
            
            
            if (leftSum * 2 == total-nums[a]){
                result = a;
                break;
            }
            leftSum += nums[a];

        }

        return result;
    }
}
