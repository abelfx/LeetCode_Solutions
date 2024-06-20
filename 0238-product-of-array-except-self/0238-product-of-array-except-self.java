class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        
        int[] leftproduct = new int[length];

        leftproduct[0] = 1;

        for(int i = 1; i < length; i++){
            leftproduct[i] = leftproduct[i -1] * nums[i-1];
        }

        int rightproduct = 1;

        for(int i = length -1; i >= 0; i--){
            answer[i] = leftproduct[i] * rightproduct;
            rightproduct *= nums[i];
        }

        return answer;
    }
}