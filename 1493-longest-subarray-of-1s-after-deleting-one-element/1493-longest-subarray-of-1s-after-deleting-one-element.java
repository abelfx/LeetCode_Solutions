class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int cur = 0;
        int tot = 0;

        boolean no = false;
        for(int num: nums){
            if(num == 0){
                no = true;
            }
        }

        if(!no){
            return nums.length -1;
        }

   

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                cur++;
                tot++;
            }
            else if(nums[i] == 0){
                tot = cur;
                cur = 0;
            }
            max = Math.max(tot, max);
        }

        return max;
        
    }
}