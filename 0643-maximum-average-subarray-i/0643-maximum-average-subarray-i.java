class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double total = 0;
        double maxtotal = 0;

        double sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
            total = sum/k;
        }

        maxtotal = total;

        for(int i = 0; i < nums.length - k; i++){
            total = total - (double) nums[i]/k;
            total = total + (double) nums[i+k]/k;

            if(maxtotal < total){
                maxtotal = total;
            }
        }
        return maxtotal;
    }
}