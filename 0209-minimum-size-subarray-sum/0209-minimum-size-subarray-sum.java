class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        
        int total = 0;
        int minLength = Integer.MAX_VALUE;
        
        while(end < nums.length){
            total += nums[end];
            
            while(total >= target){
                minLength = Math.min(minLength, (end - start + 1));
                total -= nums[start];
                start++;
            }
            end++;
        }
        
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}