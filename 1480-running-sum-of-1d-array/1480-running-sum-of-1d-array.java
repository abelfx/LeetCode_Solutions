class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        
        if(nums.length == 1){
            return nums;
        }

        for(int i = 1; i < nums.length; i++){
            runningSum[0] = nums[0];
            runningSum[i] = nums[i] + runningSum[i-1];

        }

        return runningSum;
        
    }
}