class Solution {
    public int maximumGap(int[] nums) {
        int length = nums.length;
        if(length < 2) return 0;
        
        Arrays.sort(nums);
        int max = nums[1] - nums[0];
        


        for(int i = 2; i < length; i++){
            int pMax =nums[i] - nums[i-1];
            if( pMax > max){
                max = pMax;
            }
        }
        
        return max;

    }
}