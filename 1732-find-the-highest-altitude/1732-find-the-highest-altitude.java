class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxsum = 0;

        for(int i: gain){
            sum += i;
            if(sum > maxsum){
                maxsum = sum;
            }
        }

        return maxsum;
        
    }
}