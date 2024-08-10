class Solution {
    public boolean increasingTriplet(int[] nums) {
        int length = nums.length;
        if(length < 3) return false;
        
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        
        int num = 0;
        
        while(num < length){
            if(nums[num] <= i){
                i = nums[num];
            }else if(nums[num] <= j){
                j = nums[num];
            }else {
                return true;
            }
            num++;
        }
        
        return false;
    }
}