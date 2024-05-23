import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] result = new int[n + 1];
        Arrays.fill(result, -1);

        for(int i = 0; i < nums.length; i++){
            result[nums[i]] = nums[i];
        }
        for(int i = 0; i < result.length; i++){
            if(result[i] == -1){
                return i;
            }
        }
        return -1;
    }
}