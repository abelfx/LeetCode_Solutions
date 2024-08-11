class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int i = 0;
        int j = 1;
        
        int output = 0;
        while( i < j){
            if(nums[i] == nums[j]){
                output++;
            }
            if(i == nums.length - 2){
                break;
            }
            if(j == nums.length -1){
                i++;
                j = i;
            }
            
            j++;
            
            
        }
        
        return output;
        
    }
}